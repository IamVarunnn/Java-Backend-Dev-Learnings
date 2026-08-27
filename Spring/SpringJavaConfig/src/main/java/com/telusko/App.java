package com.telusko;

import com.telusko.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop desktop = context.getBean( "desktop", Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1 = context.getBean( "desktop", Desktop.class);
//        desktop1.compile();

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();


    }
}
