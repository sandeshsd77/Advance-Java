package com.it_shaala;

import com.it_shaala.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class SaveEmployeeList {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sandesh");
        employee.setAddress(List.of("Pune", "Mumbai", "Washim", "Dubai")); // List.of() comes from java 9 if ur using earlier version we can use below code
//        employee.setAddress(Arrays.asList("pune","abd")); // for earlier version below than java version 9

        employee.setPhoneNumber(List.of(8789789,46545464,564654));

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.it_shaala.Employee.class);
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        System.out.println("Employee Object saved");

    }
}