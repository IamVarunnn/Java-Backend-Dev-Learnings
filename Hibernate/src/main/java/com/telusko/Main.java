package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Grey");
        s1.setRollNo(99);
        s1.setAge(54);

        Student s2 = null;


//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.telusko.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();


        Laptop lap = new Laptop();
        lap.setLid(1);
        lap.setBrand("Asus");
        lap.setModel("Rog");
        lap.setRam(16);


        Laptop lap2 = new Laptop();
        lap2.setLid(2);
        lap2.setBrand("Dell");
        lap2.setModel("Xp");
        lap2.setRam(16);

        Laptop lap3 = new Laptop();
        lap3.setLid(3);
        lap3.setBrand("Max");
        lap3.setModel("Air");
        lap3.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(71);
        a1.setSname("Karan");
        a1.setTech("C");
        a1.setLaptops(Arrays.asList(lap, lap2));

        Alien a2 = new Alien();
        a2.setAid(72);
        a2.setSname("Harsh");
        a2.setTech("Python");

        Alien a3 = new Alien();
        a3.setAid(73);
        a3.setSname("Krish");
        a3.setTech("Java");

        a1.setLaptops(Arrays.asList(lap, lap2));
        a2.setLaptops(Arrays.asList(lap2, lap3));
        a3.setLaptops(Arrays.asList(lap));

        lap.setAliens(Arrays.asList(a1, a3));
        lap2.setAliens(Arrays.asList(a1, a2));
        lap3.setAliens(Arrays.asList(a2));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Alien.class)
                .addAnnotatedClass(com.telusko.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(lap);
        session.persist(lap2);
        session.persist(lap3);

        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        transaction.commit();

        Alien a5 = session.find(Alien.class, 72);
        System.out.println("lap id  = " + lap.getLid());
        System.out.println("lap2 id = " + lap2.getLid());
        System.out.println(a5);

    }
}
