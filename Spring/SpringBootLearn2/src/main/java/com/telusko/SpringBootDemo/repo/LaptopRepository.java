package com.telusko.SpringBootDemo.repo;

import com.telusko.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Laptop saved");
    }
}
