package com.telusko;

import com.telusko.config.AppConfig;
import com.telusko.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);




////        Desktop desktop = context.getBean(Desktop.class);
//
//        Desktop desktop = context.getBean( Desktop.class);
//        Desktop desktop2 = context.getBean(Desktop.class);


//        desktop.compile();
//
//        desktop2.compile();


//        Alien alien = context.getBean(Alien.class);
//        alien.setAge(56);
//        System.out.println(alien.getAge());
//        alien.code();


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();
    }
}
