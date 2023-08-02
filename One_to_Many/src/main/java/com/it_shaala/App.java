package com.it_shaala;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Question question = new Question();
        question.setQuestion("Specifications of java ");

        Answer answer1 = new Answer();
        answer1.setAnswer("java is Object oriented language");
        answer1.setQuestion(question);


        Answer answer2 = new Answer();
        answer2.setAnswer("java is Simple, Secure");
        answer2.setQuestion(question);


        List<Answer> list = new ArrayList<>();
        list.add(answer1);
        list.add(answer2);

        question.setAnswers(list);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(com.it_shaala.Answer.class);
        configuration.addAnnotatedClass(com.it_shaala.Question.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(question);
        session.save(answer1);
        session.save(answer2);
        transaction.commit();
        session.close();

        System.out.println("Done");
    }
}
