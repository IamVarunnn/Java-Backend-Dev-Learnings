package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.dialect.function.LpadRpadPadEmulation;
import org.hibernate.query.Query;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(com.telusko.Laptop.class)
                .buildSessionFactory();

        Session session = sf.openSession();


        Laptop l = session.find(Laptop.class, 991);
        System.out.println(l);



        Session session1 = sf.openSession();
        Laptop l1 = session1.find(Laptop.class, 991);
        System.out.println(l1);

        session1.close();
        session.close();
        sf.close();
    }
}
