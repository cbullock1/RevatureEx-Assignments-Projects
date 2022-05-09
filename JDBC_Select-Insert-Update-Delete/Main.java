package com.revature;


import java.sql.*;
import java.util.Scanner;

public class Main {

    static void print(Statement statement) throws SQLException {

        String sql = "Select * from employee";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("Contents of the Employee Table");
        while (resultSet.next()){
            System.out.println("Id: " + resultSet.getInt(1) + ",  Name: " + resultSet.getString(2)
                    + ", Email: " + resultSet.getString(3));
        }
        System.out.println();
    }

    static void insert(Statement statement) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type ID, Name, email in this format id; name; email");
        int id = scanner.nextInt();
        String name = scanner.next();
        String email = scanner.next();

        String InsertSql = "INSERT INTO employee VALUES('"+ id+ "', '" + name + "', '" + email  + "')";
        int rows = statement.executeUpdate(InsertSql);

        System.out.println("Rows updated: " + rows);
        System.out.println();
    }

    static void Update(Statement statement) throws SQLException {
        System.out.println("please pick the column you want to edit");
        System.out.println("1. For id, 2. For name, 3. For email");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int id;
        String name;
        String email;
        String sql1 = "";
        boolean accept = false;
        while (!accept) {
            switch (choice) {
                case 1:
                    System.out.println("Please type the id number to be change");
                    id = scanner.nextInt();
                    sql1 = "UPDATE employee SET id = " + id;
                    accept = true;
                    break;
                case 2:
                    System.out.println("Please type the name to be change");
                    name = scanner.next();
                    sql1 = "UPDATE employee SET name = '" + name+"'";
                    accept = true;
                    break;
                case 3:
                    System.out.println("Please type the email to be change");
                    email = scanner.next();
                    sql1 = "UPDATE employee SET email = '" + email+"'";
                    accept = true;
                    break;
                default:
                    System.out.println("Invalid entry please re-enter choice");
                    System.out.println("1. For id, 2. For name, 3. For email");
                    System.out.println();
                    choice = scanner.nextInt();
            }
        }
        System.out.println();
        int refId;
        String refName;
        String refEmail;
        String sql2 = null;
        System.out.println("What values did you want to use for the Where");
        System.out.println("1. For id, 2. For name, 3. For email, other No where");
        int choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Please type the id number to be referenced");
                    refId = scanner.nextInt();
                    sql2 = " WHERE id = " + refId;
                    break;
                case 2:
                    System.out.println("Please type the name to be referenced");
                    refName = scanner.next();
                    sql2 = " WHERE name = '" + refName+"'";
                    break;
                case 3:
                    System.out.println("Please type the email to be referenced");
                    refEmail = scanner.next();
                    sql2 = " WHERE email = '" + refEmail+"'";
                    break;
                default:
                    System.out.println("No where selected");
            }
            int rows = 0;
            if(sql2 != null){
                rows = statement.executeUpdate((sql1+sql2));
            }
            else {
                rows = statement.executeUpdate(sql1);
            }

        System.out.println("Rows affected: " + rows);
        System.out.println();


    }

    static void delete(Statement statement) throws SQLException {

        String delete1  = "DELETE FROM employee";

        System.out.println("Please indicate what value you want to base the delete off of");
        System.out.println("Press 1 for Id, 2 for name, and 3 for email, else the entire table will be deleted");
        int id = 0;
        String name, email, delete2 = null;
        Scanner scanner = new Scanner(System.in);
        int choice  = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("What id do you want to delete");
                id = scanner.nextInt();
                delete2 = " WHERE id = " + id + ";";
                break;
            case 2:
                System.out.println("What name do you want to delete");
                name = scanner.next();
                delete2 = " WHERE name = '" + name + "';";
                break;
            case 3:
                System.out.println("What email do you want to delete");
                email = scanner.next();
                delete2 = " WHERE email = '" + email + "';";
                break;
            default:
                System.out.println("The entire table will be deleted");
        }
        String sql = delete1.concat(delete2);

        int rows = statement.executeUpdate(sql);
        System.out.println("Number of rows effected: " + rows);
        System.out.println();





    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    // Step 1 Load Driver
        //Class.forName("jbc:mysql://localhost");

        //Step 2 Create Connection Object
        String url = "jdbc:mysql://localhost:3306/revature";
        String user = "root";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your MySQL Password");
        String pass = scanner.next();

        Connection connection = DriverManager.getConnection(url,user,pass);

        //Step 3
        Statement statement = connection.createStatement();

        //Step 4 Exicute Querry

        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while (run){
            System.out.println("Please choose an action");
            System.out.println("1. Print Employee table, 2. Insert into employee table, 3. Update employee table, 4. Delete from employee table, Other end program");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    print(statement);
                    break;
                case 2:
                    insert(statement);
                    break;
                case 3:
                    Update(statement);
                    break;
                case 4:
                    delete(statement);
                    break;
                default:
                    run = false;
            }

        }



        //Step 5
        connection.close();


    }
}
