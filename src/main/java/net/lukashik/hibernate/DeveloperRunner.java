package net.lukashik.hibernate;

import net.lukashik.hibernate.model.Developer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DeveloperRunner {
    public static SessionFactory sessionFactory = null;

    public static void main(String[] args) {

        sessionFactory = new Configuration().configure().buildSessionFactory();

        List<Developer>developers = listDevelopers();
        System.out.println("Developers");
        System.out.println(developers);

        DeveloperRunner developerRunner = new DeveloperRunner();


        System.out.println("Adding Developers");






    }

    public static List<Developer> listDevelopers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        List result = session.createQuery("FROM Developer").list();

        transaction.commit();
        session.close();
        return result;
    }

//    public void addDeveloper() {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = null;
//        transaction = session.beginTransaction();
//
//
//
//
//    }



}
