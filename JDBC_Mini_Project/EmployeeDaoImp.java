package com.revature;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDaoImp implements EmployeeDAO{

    Connection connection;

    public EmployeeDaoImp(){
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {

        String sql = "INSERT INTO employee (name, email) VALUES (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getEmail());

        int count = preparedStatement.executeUpdate();
        if(count > 0){
            System.out.println("Employee Saved");
        }
        else {
            System.out.println("Oops something went wrong");
        }

    }

    @Override
    public void updateEmployee(Employee employee) throws SQLException {
        String sql = "UPDATE employee SET name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setString(2, employee.getEmail());
        preparedStatement.setInt(3,employee.getId());

        int rows = preparedStatement.executeUpdate();

        System.out.println("Rows effected: " + rows);

    }

    @Override
    public void deleteEmployee(int id) throws SQLException {
        String sql = "DELETE FROM employee WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);

        int rows = preparedStatement.executeUpdate();
        System.out.println("Rows affected : " + rows);

    }

    @Override
    public List<Employee> getEmployees() throws SQLException {

        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            employees.add(new Employee(id,name,email));
        }

        return employees;
    }

    @Override
    public Employee getEmployeeById(int id) throws SQLException {

        String sql = "SELECT * FROM Employee WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            return new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
        }
        System.out.println("Employee not Found please check your information");
        return null;
    }

    @Override
    public void close_Connection() {

    }
}
