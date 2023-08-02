package com.it_shaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class AddUser {
    public static void main(String[] args) throws IOException {
        // reading the data from properties file and putting this in the properties object.
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sande\\IdeaProjects\\Hibernate\\src\\main\\java\\resource\\hibernate.cfg.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        //build the object from user Details
        User user = User.builder()
                .name("priya")
                .email("priya@123")
                .phone("4654127")
                .username("priya")
                .password("priya")
                .build();

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(com.it_shaala.User.class);

        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new
                StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        SessionFactory sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }
}
