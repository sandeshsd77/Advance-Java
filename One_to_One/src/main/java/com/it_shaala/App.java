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
        Question question1 = new Question();
        question1.setQuestion("what is java");

        Answer answer1 = new Answer();
        answer1.setAnswer("java is programing language");

        answer1.setQuestion(question1);
        question1.setAnswer(answer1);


        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.it_shaala.Question.class);
        configuration.addAnnotatedClass(com.it_shaala.Answer.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(question1);
        session.save(answer1);
        transaction.commit();
        session.close();
        System.out.println( "Done" );
    }
}
