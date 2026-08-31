package com.telusko.SpringBootDemo.service;

import com.telusko.SpringBootDemo.model.Laptop;
import com.telusko.SpringBootDemo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repository;

    public void save(Laptop laptop){
        repository.save(laptop);
    }
    public void addLaptop(Laptop laptop){
        System.out.println("Laptop added");
    }
}
