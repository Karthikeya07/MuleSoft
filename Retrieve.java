package com.company;

import java.sql.*;

public class Retrieve {
    public static void main(String[] args) {

        try {

            Connection conn = null;
            Statement stm = null;

            conn = DriverManager.getConnection(
                    "jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connected Successfully !!");

            stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT * FROM Movies;");

            while (rs.next()) {

                String movie = rs.getString("Movie");

                String Director = rs.getString("Director");

                String Actor = rs.getString("Actor");

                String Actress = rs.getString("Actress");

                int ReleaseDate = rs.getInt("ReleaseDate");

                System.out.println("Movie         : " + movie);

                System.out.println("Director      : " + Director);

                System.out.println("Actor         : " + Actor);

                System.out.println("Actress       : " + Actress);

                System.out.println("Release Year  : " + ReleaseDate);

                System.out.println();

            }

            rs.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Data retrieved successfully!");
    }
}