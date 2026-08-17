package com.telusko;


public class Alien {
    private int age;
    Laptop laptop;
    public Alien(){
        System.out.println("Object Created");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void code(){
        laptop.compile();
    }
}
