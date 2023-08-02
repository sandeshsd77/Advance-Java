package com.it_shaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("buldhana");
        address.setCountry("india");
        address.setState("mh");
        address.setPinCode(264644);

        Employee employee = new Employee();
        employee.setName("sandesh");
        employee.setSalary("150000");
        employee.setAddress(address);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.it_shaala.Employee.class);
        configuration.addAnnotatedClass(com.it_shaala.Address.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();


        System.out.println("Employee Saved with Address");
    }
}
