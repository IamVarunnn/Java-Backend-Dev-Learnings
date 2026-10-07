package com.telusko.SpringEcom.service;

import org.springframework.ai.google.genai.image.GoogleGenAiImageOptions;
import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URL;

@Service
public class AiImageGeneratorService {

    @Autowired
    private ImageModel imageModel;
    public byte[] generateImage(String imagePrompt) {

        GoogleGenAiImageOptions options = GoogleGenAiImageOptions.builder()
                .build();

        ImageResponse response = imageModel.call(new ImagePrompt(imagePrompt, options));
        String imageUrl = response.getResult().getOutput().getUrl();

        try{
            return new URL(imageUrl).openStream().readAllBytes();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
