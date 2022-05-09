package com.revature;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;
    void updateEmployee(Employee employee) throws SQLException;
    void deleteEmployee(int id) throws SQLException;
    public List<Employee> getEmployees() throws SQLException;
    public Employee getEmployeeById(int id) throws SQLException;
    void close_Connection();
}
