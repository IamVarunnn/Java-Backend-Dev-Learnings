package com.telusko.SpringAIApp1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AudioGenController {


    @PostMapping("api/stt")
    public String speechToText(){
        return "";
    }
}
