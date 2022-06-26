package com.company;

import java.sql.*;

public class RecordInsert {
    public static void main(String[] args) {
        try {

            Connection conn = null;
            Statement stm = null;

            conn = DriverManager
                    .getConnection(
                            "jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connected Successfully !!");

            stm = conn.createStatement(); // Create Statement

            String qry0 = "INSERT INTO Movies values ('Maharshi','Mahesh Babu','Pooja Hegde', 2019,'Vamshi');";
            stm.executeUpdate(qry0); // Create Query-1

            String qry1 = "INSERT INTO Movies values ('Hello','Akhil','Kalyani', 2017,'Vikram.K.Kumar');";
            stm.executeUpdate(qry1); // Create Query-1

            String qry2 = "INSERT INTO Movies values ('Vikram','Kamalhassan','Shivani',2022,'Lokesh');";
            stm.executeUpdate(qry2); // Create Query-2

            String qry3 = "INSERT INTO Movies values ('Mosagallu','Vishnu Manchu','Kajal',2021,'Jeffrey');";
            stm.executeUpdate(qry3); // Create Query-3

            String qry4 = "INSERT INTO Movies values ('Son of India','MohanBabu','Unknown',2022,'Laxmi');";
            stm.executeUpdate(qry4); // Create Query-4

            String qry5 = "INSERT INTO Movies values ('RRR','NTR','Jenny',2022,'Rajmouli');";
            stm.executeUpdate(qry5);
            stm.close();

            conn.close(); // Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records  Inserted successfully");
    }
}