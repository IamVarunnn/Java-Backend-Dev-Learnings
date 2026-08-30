package com.telusko.SpringBootDemo;

import com.telusko.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Saved to Database");
    }
}
