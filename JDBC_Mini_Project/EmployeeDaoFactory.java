package com.revature;

public class EmployeeDaoFactory {
    public static EmployeeDAO employeeDAO;
    private EmployeeDaoFactory(){

    }
    public static EmployeeDAO getEmployeeDAO(){
        if(employeeDAO == null)
            employeeDAO = new EmployeeDaoImp();
        return employeeDAO;

    }

}
