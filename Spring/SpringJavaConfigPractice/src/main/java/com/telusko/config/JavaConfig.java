package com.telusko.config;


import com.telusko.Alien;
import com.telusko.Computer;
import com.telusko.Desktop;
import com.telusko.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.telusko")
public class JavaConfig {

//    @Bean(name = "desktop")
//    @Scope("prototype")

//
//    @Bean
//    public Alien alien(Computer computer){
//        Alien obj = new Alien();
//        obj.setComputer(computer);
//        obj.setAge(45);
//        return obj;
//    }
//
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
