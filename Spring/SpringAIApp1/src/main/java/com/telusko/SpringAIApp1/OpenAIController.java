package com.telusko.SpringAIApp1;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAIController {


    private OpenAiChatModel openAiChatModel;


    public OpenAIController(OpenAiChatModel openAiChatModel){
        this.openAiChatModel = openAiChatModel;
    }

    @GetMapping("/api/{message}")
    public String getAnswer(@PathVariable String message){

        String response = openAiChatModel.call(message);

        return response;
    }
}
