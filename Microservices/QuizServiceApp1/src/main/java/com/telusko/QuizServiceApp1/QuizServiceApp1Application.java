package com.telusko.QuizServiceApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApp1Application.class, args);
	}

}
