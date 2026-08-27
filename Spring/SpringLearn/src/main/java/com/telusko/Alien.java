package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private Computer computer;
    public Alien(){
        System.out.println("Object Created");
    }



//    @ConstructorProperties({"age", "laptop"})
//    public Alien(int age, Laptop laptop){
//        System.out.println("Para Constructor Called");
//        this.age = age;
//        this.laptop = laptop;
//    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Coding");
        computer.compile();
    }

}
