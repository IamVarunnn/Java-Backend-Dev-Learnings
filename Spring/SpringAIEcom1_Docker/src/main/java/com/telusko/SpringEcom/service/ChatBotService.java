package com.telusko.SpringEcom.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.pgvector.PgVectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class ChatBotService {


    @Autowired
    private ResourceLoader resourceLoader;

    @Autowired
    private PgVectorStore pgVectorStore;

    @Autowired
    private ChatClient chatClient;

    public String getBotResponse(String userQuery) {

        try {
            String promptStringTemplate = Files.readString(
                    resourceLoader.getResource("classpath:prompts/chatbot-rag-prompt.st")
                            .getFile()
                            .toPath()
            );

            String context = fetchSemanticContext(userQuery);

            Map<String, Object> variabls = new HashMap<>();
            variabls.put("userQuery", userQuery);
            variabls.put("context", context);

            PromptTemplate promptTemplate = PromptTemplate.builder()
                    .template(promptStringTemplate)
                    .variables(variabls)
                    .build();

            return chatClient.prompt(promptTemplate.create())
                    .call()
                    .content();
        }
        catch (Exception e){
            return "Bot Failed " + e.getMessage();
        }
    }

    private String fetchSemanticContext(String userQuery) {

        List<Document> documentList = pgVectorStore.similaritySearch(
                SearchRequest.builder()
                        .query(userQuery)
                        .topK(5)
                        .similarityThreshold(0.7f)
                        .build()
        );

        StringBuilder context = new StringBuilder();

        for(Document document : documentList){
            context.append(document.getFormattedContent()).append("\n");
        }
        return context.toString();
    }
}
