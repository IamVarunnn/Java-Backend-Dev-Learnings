package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien a = (Alien) context.getBean("alien");
        a.code();

        Laptop laptop = (Laptop) context.getBean("lap");
        laptop.use();
    }
}
