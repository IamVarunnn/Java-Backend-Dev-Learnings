package com.telusko.SpringAIApp1;

import org.springframework.ai.audio.transcription.AudioTranscriptionOptions;
import org.springframework.ai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AudioGenController {

    private final ChatClient chatClient;

    public AudioGenController(OllamaChatModel chatModel,
                              ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @PostMapping("/api/stt")
    public String speechToText(@RequestParam MultipartFile file) {



        return chatClient.prompt()
                .user(us -> us
                        .text("Transcribe this audio exactly as spoken.")
                        .media(
                                MimeTypeUtils.parseMimeType(file.getContentType()),
                                file.getResource()
                        ))
                .call()
                .content();
    }
}