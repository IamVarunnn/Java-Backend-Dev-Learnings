package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Student st1 = new Student();
//
//        st1.setRollNo(3);
//        st1.setName("Carry John");
//        st1.setAge(31);
//
//
//
////        Configuration configuration = new Configuration();
////        configuration.addAnnotatedClass(com.telusko.Student.class);
////
////        configuration.configure();
////
////        SessionFactory sessionFactory = configuration.buildSessionFactory();
////        Session session = sessionFactory.openSession();
//
//
//        SessionFactory sessionFactory = new Configuration()
//                .addAnnotatedClass(com.telusko.Student.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//
//
//        Student s2 = session.find(Student.class, 184);
////        System.out.println(s2);
////        session.merge(st1);
//
//
//
//        session.remove(s2);
//
//
//        Transaction transaction = session.beginTransaction();
//
//        transaction.commit();
//
//        sessionFactory.close();
//        session.close();
//
////        System.out.println(st1);


        Alien a1 = new Alien();
        a1.setAname("Nave");
        a1.setAid(101);
        a1.setTech("Python");

        Laptop laptop = new Laptop();
        laptop.setBrand("Asus");
        laptop.setRam(16);
        laptop.setModel("Rog");

        a1.setLaptop(laptop);



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.telusko.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        session.persist(a1);

        Transaction transaction = session.beginTransaction();
        transaction.commit();





//        System.out.println(a1);
        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);

    }
}
