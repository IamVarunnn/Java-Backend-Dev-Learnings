package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien a = (Alien) (context.getBean("alien"));
//
//        System.out.println(a.getAge());
//
//        a.code();


//        Alien a = context.getBean("alien", Alien.class);
//        a.code();
//
//        Laptop laptop = context.getBean("comp1", Laptop.class);
//        laptop.compile();

//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.compile();




    }
}
