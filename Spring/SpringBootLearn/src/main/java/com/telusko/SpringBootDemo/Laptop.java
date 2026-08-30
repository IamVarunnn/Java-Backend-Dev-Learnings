package com.telusko.SpringBootDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{


    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
