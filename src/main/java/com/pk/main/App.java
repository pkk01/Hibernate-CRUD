package com.pk.main;

import com.pk.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

//        User user1 = new User();
//        user1.setName("John");
//        user1.setEmail("john@gmail.com");
//        user1.setPassword("1234");
//        user1.setGender("male");
//        user1.setCity("San Francisco");

        // another user

//        User user2 = new User();
//
//        user2.setName("mohit");
//        user2.setEmail("mohit@gmail.com");
//        user2.setPassword("mohit123");
//        user2.setCity("varanasi");
//        user2.setGender("male");

        Configuration config = new Configuration();
        config.configure("/com/pk/config/hibernate.cfg.xml");

        // SessionFactory creates and manages Session objects
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Session manages database operation like CRUD and queries
        Session session = sessionFactory.openSession();

        // Transaction controls the boundaries of database transaction
        // commit or rollback

        Transaction transaction = session.beginTransaction();

        // ------------Insert Operation-------------------//
//        try {
//            // to perform CRUD operation on user1
//            session.save(user2);
//            // to commit the changes in the database
//            transaction.commit();
//
//            System.out.println("user added successfully");
//        } catch (Exception e) {
//
//            // if any error occurs it will rollback the transaction
//            System.out.println("user added failed");
//            transaction.rollback();
//            e.printStackTrace();
//        }

        //--------------select Operation------------
        try {
            // to get the user of id = 1 from User.class
            User user1 = session.get(User.class, 2L);
            if (user1 != null) {
                System.out.println(user1);
            } else {
                System.out.println("User not found");
            }

        } catch (Exception e) {
            // here transaction.rollback() is not need because we are just getting the values
            // it is required in insert, update and delete operations only.
            e.printStackTrace();
        }
    }
}
