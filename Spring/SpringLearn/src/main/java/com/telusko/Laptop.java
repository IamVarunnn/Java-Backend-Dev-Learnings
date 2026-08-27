package com.telusko;

public class Laptop implements Computer {

    Laptop(){
        System.out.println("Laptop Created");
    }

    @Override
    public void compile(){
        System.out.println("Compiling using Laptop");
    }
}
