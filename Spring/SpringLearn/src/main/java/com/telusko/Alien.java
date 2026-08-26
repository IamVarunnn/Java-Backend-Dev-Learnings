package com.telusko;

import java.beans.ConstructorProperties;

public class Alien {


    private int age;

    private Computer comp;

    public Alien(){
//        System.out.println("Object Created");
    }

//    @ConstructorProperties({"age", "laptop1"})
//    public Alien(int age, Computer comp){
//        System.out.println("ParaCons Called");
//        this.age = age;
//        this.comp = comp;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding");
        comp.compile();
    }
}
