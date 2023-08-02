package com.it_shaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setName("sandesh");

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("nikhil");
        contractEmployee.setRatePerHour(1000);

        PermanantEmployee permanantEmployee = new PermanantEmployee();
        permanantEmployee.setName("lalit");
        permanantEmployee.setSalary(20000);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.it_shaala.Employee.class);
        configuration.addAnnotatedClass(com.it_shaala.ContractEmployee.class);
        configuration.addAnnotatedClass(com.it_shaala.PermanantEmployee.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.save(contractEmployee);
        session.save(permanantEmployee);
        transaction.commit();
        session.close();
        System.out.println( "Employee Saved" );
    }
}
