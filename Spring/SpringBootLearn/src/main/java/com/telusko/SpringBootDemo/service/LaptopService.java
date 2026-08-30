package com.telusko.SpringBootDemo.service;

import com.telusko.SpringBootDemo.LaptopRepository;
import com.telusko.SpringBootDemo.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop){
        System.out.println("Added");
        repo.save(laptop);
    }

    public boolean isGoodForProgram(Laptop laptop){
        return true;
    }
}
