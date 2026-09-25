package com.telusko.SpringSecurityApp1.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "Home";
    }

    @GetMapping("/hello")
    public String greet(){
        return "Hello  ";
    }

    @GetMapping("about")
    public String about(){
        return "Fearz";
    }
}
