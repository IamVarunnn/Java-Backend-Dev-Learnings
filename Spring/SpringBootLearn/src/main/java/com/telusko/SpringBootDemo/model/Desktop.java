package com.telusko.SpringBootDemo.model;

import com.telusko.SpringBootDemo.model.Computer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
