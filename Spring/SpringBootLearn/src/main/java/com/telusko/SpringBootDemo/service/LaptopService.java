package com.telusko.SpringBootDemo.service;

import com.telusko.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    public void addLaptop(Laptop laptop){
        System.out.println("Added");
    }

    public boolean isGoodForProgram(Laptop laptop){
        return true;
    }
}
