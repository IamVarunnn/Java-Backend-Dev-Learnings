package com.telusko;

public class Desktop implements Computer{

    Desktop(){
        System.out.println("Desktop Created");
    }
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
