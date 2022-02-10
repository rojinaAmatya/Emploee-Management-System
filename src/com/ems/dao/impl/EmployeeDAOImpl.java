package com.ems.dao.impl;
import com.ems.dao.EmployeeDAO;
import com.ems.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO {

    Scanner sc = new Scanner(System.in);
    List<Employee> addEmployees= new ArrayList<>();

    @Override
    public void addEmployee() {
        int k =1;
        while (k ==1) {
            System.out.println("Enter the Employee ID: ");
            int emp_id = sc.nextInt();
            System.out.println("Enter the Employee name");
            String emp_name = sc.next();
            System.out.println("Enter the Employee Address");
            String emp_address = sc.next();
            System.out.println("Enter the Employee email");
            String emp_email = sc.next();

            Employee employee = new Employee(emp_id, emp_name, emp_address, emp_email);
            addEmployees.add(employee);
            System.out.println("Employee is registered successfully");

            System.out.println("Do you want to add more employee? Press 1> Yes 2> No");
            k = sc.nextInt();
        }// end of while

    }

    @Override
    public List<Employee> viewEmployees() {
        return null;
    }

    @Override
    public Employee viewEmployee(int emp_id) {
        return null;
    }

    @Override
    public void updateEmployee() {

    }

    @Override
    public void deleteEmployee() {

    }
}
