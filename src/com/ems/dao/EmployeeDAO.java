package com.ems.dao;

import com.ems.pojo.Employee;

import java.util.List;

public interface EmployeeDAO {
    public void addEmployee();
    List<Employee> viewEmployees();
    Employee viewEmployee(int emp_id);
    void updateEmployee(int emp_id);
    void deleteEmployee(int emp_id);
}

