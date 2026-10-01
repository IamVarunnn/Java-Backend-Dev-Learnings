package com.telusko.SpringAIApp1;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemoryRepository;
import org.springframework.ai.chat.memory.MessageWindowChatMemory;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaAIController {


//    private  OllamaChatModel ollamaChatModel;



//    public OllamaAIController(OllamaChatModel ollamaChatModel){
//        this.ollamaChatModel = ollamaChatModel;
//    }

//    @GetMapping("/api/{message}")
//    public String getAnswer(@PathVariable String message){
//
//        String response = ollamaChatModel.call(message);
//
//        return response;
//    }

//    With Chat Client
//    private ChatClient chatClient;
//
//    public OllamaAIController(OllamaChatModel ollamaChatModel){
//        this.chatClient = ChatClient.create(ollamaChatModel);
//    }
//
//
////    @GetMapping("/api/{message}")
////    public ResponseEntity<String> getAnswer(@PathVariable String message){
////
////        String response = chatClient
////                .prompt(message)
////                .call()
////                .content();
////
////        return ResponseEntity.ok(response);
////    }
//
//
//    @GetMapping("/api/{message}")
//    public ResponseEntity<String> getAnswer(@PathVariable String message){
//
//        ChatResponse chatResponse = chatClient
//                .prompt(message)
//                .call()
//                .chatResponse();
//
//        System.out.println(chatResponse.getMetadata().getModel());
//
//        String response = chatResponse
//                .getResult()
//                .getOutput()
//                .getText();
//
//        return ResponseEntity.ok(response);
//    }

    private ChatClient chatClient;

    public OllamaAIController(ChatClient.Builder builder) {

        ChatMemory chatMemory = MessageWindowChatMemory.builder()
                .chatMemoryRepository(new InMemoryChatMemoryRepository())
                .maxMessages(20)
                .build();

        this.chatClient = builder
                .defaultAdvisors(
                        MessageChatMemoryAdvisor.builder(chatMemory).build()
                )
                .build();
    }

    @GetMapping("/api/{message}")
    public ResponseEntity<String> getAnswer(@PathVariable String message){

        ChatResponse chatResponse = chatClient
                .prompt()
                .user(message)
                .advisors(a -> a.param(
                        ChatMemory.CONVERSATION_ID,
                        "user1"
                ))
                .call()
                .chatResponse();

        System.out.println(chatResponse.getMetadata().getModel());

        String response = chatResponse
                .getResult()
                .getOutput()
                .getText();

        return ResponseEntity.ok(response);
    }


}
