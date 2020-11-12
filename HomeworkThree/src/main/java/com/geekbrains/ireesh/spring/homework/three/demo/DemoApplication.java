package com.geekbrains.ireesh.spring.homework.three.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class DemoApplication {

    public static void prepareDataForDatabase() {
        SessionFactory factory = new Configuration()
                .configure("configs/hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = null;

        try {
            String[] queryList = Files.readString(Paths.get("query.sql")).split(";");

            for (String sql : queryList) {
                if (!sql.trim().equals("")) {
                    session = factory.getCurrentSession();
                    session.beginTransaction();
                    session.createNativeQuery(sql).executeUpdate();
                    session.getTransaction().commit();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }

    public static void main(String[] args) {
        prepareDataForDatabase();
        SpringApplication.run(DemoApplication.class, args);
        SQLConversation sqlConversation = new SQLConversation();
        sqlConversation.getProductsList();
    }

}
