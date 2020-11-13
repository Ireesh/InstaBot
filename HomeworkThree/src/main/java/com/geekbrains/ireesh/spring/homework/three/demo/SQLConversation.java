package com.geekbrains.ireesh.spring.homework.three.demo;

import com.geekbrains.ireesh.spring.homework.three.demo.entities.Customer;
import com.geekbrains.ireesh.spring.homework.three.demo.entities.Product;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SQLConversation {
    private SessionFactory factory;
    private Session session = null;

    private  Session createSession() {
        factory = new Configuration()
                .configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
        session = factory.getCurrentSession();
        return session;
    }

    public List<Product> getProductsList() {
        Session session = createSession();
        List<Product> list = null;
        try {
            session.beginTransaction();
            list = session.createQuery("from Product p").list();
            session.getTransaction().commit();
            System.out.println(list.toString());
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
        return list;
    }

    public List<Customer> getCustomerList() {
        Session session = createSession();
        List<Customer> list = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            list = session.createQuery("from Customer c").list();
            session.getTransaction().commit();
            System.out.println(list.toString());
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
        return list;
    }

    public void addProduct(Product p) {
        Session session = createSession();
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
    }

    public void addCustomer(Customer c) {
        Session session = createSession();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
    }

    public void deleteProduct(Product product) {
        Session session = createSession();
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
    }


}

