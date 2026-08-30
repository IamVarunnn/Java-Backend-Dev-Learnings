package com.telusko.SpringBootDemo.model;


import com.telusko.SpringBootDemo.model.Computer;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {


    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
