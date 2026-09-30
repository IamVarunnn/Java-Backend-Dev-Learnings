package com.telusko.SpringAIApp1;

import org.springframework.ai.chat.client.ChatClient;
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
    private ChatClient chatClient;

    public OllamaAIController(OllamaChatModel ollamaChatModel){
        this.chatClient = ChatClient.create(ollamaChatModel);
    }


    @GetMapping("/api/{message}")
    public String getAnswer(@PathVariable String message){

        String response = chatClient
                .prompt(message)
                .call()
                .content();

        return "With Chat Client " + response;
    }
}
