package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer{

    public Laptop(){
        System.out.println("Laptop Created");
    }
    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
