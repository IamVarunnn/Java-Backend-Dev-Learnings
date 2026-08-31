package com.telusko.config;


import com.telusko.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "desktop")
    public Desktop desktop(){
        return new Desktop();
    }
}
