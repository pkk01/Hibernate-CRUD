package com.pk.main;


import com.pk.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setId(1);
        user1.setName("John");
        user1.setEmail("john@gmail.com");
        user1.setPassword("1234");
        user1.setGender("male");
        user1.setCity("San Francisco");

        Configuration config = new Configuration();
        config.configure("/com/pk/config/hibernate.cfg.xml");

        // SessionFactory creates and manages Session objects
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Session manages database operation like CRUD and queries
        Session session = sessionFactory.openSession();

        // Transaction controls the boundaries of database transaction
        // commit or rollback

        Transaction transaction = session.beginTransaction();

        try {
            // to perform CRUD operation on user1
            session.save(user1);
            // to commit the changes in the database
            transaction.commit();
        } catch (Exception e) {

            // if any error occurs it will rollback the transaction
            transaction.rollback();
        }
    }
}
