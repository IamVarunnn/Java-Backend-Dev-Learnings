package com.telusko;

import com.telusko.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Desktop desktop = context.getBean(Desktop.class);
        desktop.compile();
    }
}
