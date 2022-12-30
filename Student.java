package com.company;


import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
        import java.util.Scanner;

public class Student {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chegg", "root", "root");
            // Create a direct line to the database for running our queries
            Statement statement = connection.createStatement();
            ResultSet results;
            int rowsAffected;
            Scanner sc = new Scanner(System.in);
            String option = "";
            do {
                System.out.println("Please enter the name:");
                String name = sc.next();
                System.out.println("Please enter the age:");
                int age = sc.nextInt();
                System.out.println("Please enter the gender:");
                String gender = sc.next();
                System.out.println("Please enter the course:");
                String course = sc.next();
                System.out.println("Please enter the yearentrolled:");
                int yearentrolled = sc.nextInt();
                System.out.println("Please enter the id:");
                String id = sc.next();
                // Add a new student:
                rowsAffected = statement.executeUpdate("INSERT INTO student VALUES " + "('" + name + "', " + age + ", '"
                        + gender + "','" + course + "'," + yearentrolled + ", '" + id + "')");
                System.out.println("Query complete, " + rowsAffected + " rows added.");
                System.out.println("You want to continue yes/quit");
                option = sc.next();
            } while (!option.equals("quit"));

            // Set up finished, do some stuff:
            // executeQuery: runs a SELECT statement and returns the results.
            results = statement.executeQuery("SELECT * FROM student");
            // Loop over the results, printing them all.
            System.out.println("***********Student Details**************");
            while (results.next()) {
                System.out.println(results.getString("fullname") + ", " + results.getInt("age")+", "+results.getString("gender")
                        +", "+results.getString("course") + ", " + results.getInt("yearentrolled")+", "+results.getString("id"));
            }

            // Close up our connections
            results.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            // We only want to catch a SQLException - anything else is off-limits for now.
            e.printStackTrace();
        }

    }

}