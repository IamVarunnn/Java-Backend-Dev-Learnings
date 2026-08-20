package com.telusko;

public class Alien {

    private int age;
    Laptop lap;

    public Alien(){
        System.out.println("Object Created");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Coding...");
        lap.compile();
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
