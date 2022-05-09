package com.revature;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
	EmployeeDAO dao = EmployeeDaoFactory.getEmployeeDAO();

    //Employee employee = new Employee();

    Scanner scanner = new Scanner(System.in);

    boolean flag = true;

    while (flag) {
        System.out.println("Select from options below");
        System.out.println("**************************");
        System.out.println("Press 1 for Add Employee");
        System.out.println("Press 2 for Update Employee");
        System.out.println("Press 3 for Delete Employee");
        System.out.println("Press 4 for Get all Employees");
        System.out.println("Press 5 for Get Employee by Id");
        System.out.println("Press 6 for Exit");
        System.out.println();

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Enter email");
                String email = scanner.next();
                Employee emp = new Employee();
                emp.setName(name);
                emp.setEmail(email);
                dao.addEmployee(emp);
                break;
            case 2:
                System.out.println("Please enter the ID and updated information of the employee");
                int userId = scanner.nextInt();
                String username = scanner.next();
                String useremail = scanner.next();
                dao.updateEmployee(new Employee(userId,username,useremail));
                break;

            case 3:
                System.out.println("Please enter the ID you wish to be deleted");
                int id = scanner.nextInt();
                dao.deleteEmployee(id);
                break;

            case 4:
                List<Employee> employeeList = dao.getEmployees();
                for(Employee employee : employeeList){
                    System.out.println(employee.toString());
                }

                System.out.println();
                break;

            case 5:
                System.out.println("Please enter the ID of the employee your looking for");
                id = scanner.nextInt();
                Employee result = dao.getEmployeeById(id);
                if(result != null)
                    System.out.println(result.toString());
                System.out.println();
                break;


            case 6:
                System.out.println("Thank you!");
                System.out.println("Exiting..............");
                flag = false;
                break;

            default:
                System.out.println("Please enter 1 - 6");
                System.out.println();

        }
    }

    //employee.setName("Mark");
    //employee.setEmail("m@gmail.com");

    //dao.addEmployee(employee);
        ConnectionFactory.closeConnection();
    }
}
