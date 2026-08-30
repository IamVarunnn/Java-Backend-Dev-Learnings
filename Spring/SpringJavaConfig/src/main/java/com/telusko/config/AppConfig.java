package com.telusko.config;

import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

//
//    @Bean
//    public Alien alien(@Qualifier("desktop") Computer computer){
//        Alien obj = new Alien();
//        obj.setAge(90);
//        obj.setComputer(computer);
//        return obj;
//    }
//
////    @Bean(name = "desk1")
////@Scope("prototype")
//    @Bean
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
}