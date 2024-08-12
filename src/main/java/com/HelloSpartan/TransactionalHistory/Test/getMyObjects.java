




package com.HelloSpartan.TransactionalHistory.Test;

import com.HelloSpartan.TransactionalHistory.Entity.TransactionHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class getMyObjects {
    public static void main(String[] args) {
        // Declare variables
        Configuration cfg = null;
        SessionFactory sessionFactory = null;
        Session session = null;
       // Transaction transaction = null;

      
            // Initialize configuration and session factory
            cfg = new Configuration();
            cfg.configure("com/HelloSpartan/TransactionalHistory/cfgs/hibernate.cfg.xml"); // Ensure path is correct
            sessionFactory = cfg.buildSessionFactory();
            session = sessionFactory.openSession();

           

            // Save the TransactionHistory object
           
            // Retrieve the TransactionHistory object by id
            TransactionHistory retrievedTransactionHistory = session.get(TransactionHistory.class, 542568548);

            // Display retrieved object
            if (retrievedTransactionHistory != null) {
                System.out.println("Retrieved TransactionHistory:");
                
                System.out.println("User ID: " + retrievedTransactionHistory.getUserId());
                System.out.println("Table ID: " + retrievedTransactionHistory.getTableId());
                System.out.println("Chip Type: " + retrievedTransactionHistory.getChipType());
                System.out.println("CR/DR: " + retrievedTransactionHistory.getCrdr());
                System.out.println("Status: " + retrievedTransactionHistory.getStatus());
                System.out.println("Transaction Type: " + retrievedTransactionHistory.getTransactionType());
            }
                // Add other fields as needed
             else {
                System.out.println("No TransactionHistory found with ID 1.");
             }

        }
    }
    

