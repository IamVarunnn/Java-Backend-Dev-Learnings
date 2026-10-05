package com.telusko.SpringAIApp1;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class ImageGenController {

    private final ChatClient chatClient;

    public ImageGenController(OllamaChatModel chatModel,
                           ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

//    public String genImage(@PathVariable String query){
//
//        ImagePrompt prompt = new ImagePrompt(query);
//
//        ImageResponse response = chatClient.call(prompt);
//
//        return response.getResult().getOutput().getUrl();
//    }

    @PostMapping("image/describe")
    public String descImage(@RequestParam String query,
                            @RequestParam MultipartFile file) {

        return chatClient.prompt()
                .user(us -> us.text(query)
                        .media(
                                MimeTypeUtils.parseMimeType(file.getContentType()),
                                file.getResource()
                        ))
                .call()
                .content();
    }
}