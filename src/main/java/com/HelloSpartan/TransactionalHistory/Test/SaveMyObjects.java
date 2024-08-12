package com.HelloSpartan.TransactionalHistory.Test;

import com.HelloSpartan.TransactionalHistory.Entity.TransactionHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveMyObjects {
    public static void main(String[] args) {
        // Declare variables
        Configuration cfg = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;

        try {
            // Initialize configuration and session factory
            cfg = new Configuration();
            cfg.configure("com/HelloSpartan/TransactionalHistory/cfgs/hibernate.cfg.xml"); // Ensure path is correct
            sessionFactory = cfg.buildSessionFactory();
            session = sessionFactory.openSession();

            // Create a new TransactionHistory object
            TransactionHistory transactionHistory1 = new TransactionHistory();
            
            transactionHistory1.setUserId(1159);
            transactionHistory1.setTableId(87);
            transactionHistory1.setChipType("blue");
            transactionHistory1.setCrdr("1");
            transactionHistory1.setStatus("1");
            transactionHistory1.setTransactionType("nft");
            // Ensure all required fields are set

            // Start a transaction
            transaction = session.beginTransaction();

            // Save the TransactionHistory object
            session.save(transactionHistory1);

            // Commit the transaction
            transaction.commit();

            System.out.println("TransactionHistory object saved successfully!");

        } catch (Exception e) {
            // Handle any exceptions
            if (transaction != null) {
                transaction.rollback();  // Rollback the transaction in case of an error
            }
            e.printStackTrace();
        } finally {
            // Clean up resources
            if (session != null) {
                session.close();
            }
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
