package com.telusko.SpringBootDemo;

import com.telusko.SpringBootDemo.model.Alien;
import com.telusko.SpringBootDemo.model.Laptop;
import com.telusko.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

//		Alien obj = context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

		LaptopService service = context.getBean(LaptopService.class);


		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);

	}

}
