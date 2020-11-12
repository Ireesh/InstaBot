package com.geekbrains.ireesh.spring.homework.three.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SQLConversation {
    public void getProductsList() {
        SessionFactory factory = new Configuration()
                .configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = null;

        List listProducts = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            listProducts = session.createQuery("select p from Product p").getResultList();
            System.out.println(listProducts);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }
}

