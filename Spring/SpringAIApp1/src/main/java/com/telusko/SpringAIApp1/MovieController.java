package com.telusko.SpringAIApp1;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.converter.ListOutputConverter;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;


@RestController
public class MovieController {

    private ChatClient chatClient;

    public MovieController(OllamaChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }
    @GetMapping("movies")
    public List<String> getMovies(@RequestParam String name){

        String message = """
                    List top 5 movies of {name}
                    {format}
                """;

        ListOutputConverter outputConverter = new ListOutputConverter(new DefaultConversionService());

//        PromptTemplate promptTemplate = new PromptTemplate(message, Map.of("name", name, "format", outputConverter.getFormat()));
//
//        Prompt prompt = promptTemplate.create();

        PromptTemplate promptTemplate = new PromptTemplate(message);

        Prompt prompt = promptTemplate.create(
                Map.of(
                        "name", name,
                        "format", outputConverter.getFormat()
                )
        );
        List<String> movies = outputConverter.convert(chatClient.prompt(prompt).call().content());

        return movies;
    }
}
