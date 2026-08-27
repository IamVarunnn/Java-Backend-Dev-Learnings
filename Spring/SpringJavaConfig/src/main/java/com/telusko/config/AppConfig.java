package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.telusko")
public class AppConfig {
//
//
//    @Bean
//    public Alien alien( Computer computer){
//        Alien obj = new Alien();
//        obj.setAge(45);
//        obj.setComputer(computer);
//        return obj;
//    }
//
////    @Bean(name = {"com1", "desk1"})
////    @Scope("prototype")
//    @Bean
//    public Desktop desktop(){
////        System.out.println("Desktop Created");
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
////        System.out.println("Laptop Created");
//        return new Laptop();
//    }
}
