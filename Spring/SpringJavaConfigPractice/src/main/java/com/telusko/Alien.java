package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Alien {

    private int age;

    private Computer computer;

    public Alien(){
        System.out.println("Alien Object Created");
    }

    public int getAge() {
        return age;
    }

    @Value("49")
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        computer.compile();
    }
}
