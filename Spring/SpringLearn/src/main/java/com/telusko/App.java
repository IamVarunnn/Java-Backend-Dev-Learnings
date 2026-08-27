package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj = (Alien) context.getBean("alien");
//        obj.code();


//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.setAge(45);
//        System.out.println(obj1.getAge());


//        Alien obj1 = (Alien) context.getBean("alien");
////        System.out.println(obj1.getAge());
//        obj1.code();


//        Desktop obj2 = (Desktop) context.getBean("computer2");

        Alien alien = context.getBean("alien", Alien.class);
        alien.code();
    }
}
