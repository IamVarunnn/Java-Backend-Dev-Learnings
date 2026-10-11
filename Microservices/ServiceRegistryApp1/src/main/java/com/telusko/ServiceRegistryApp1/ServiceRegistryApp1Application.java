package com.telusko.ServiceRegistryApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApp1Application.class, args);
	}

}
