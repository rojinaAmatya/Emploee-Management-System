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
        return addEmployees;
    }

    @Override
    public Employee viewEmployee(int emp_id) {
        for (Employee emp: addEmployees){
            if(emp.getEmp_id() == emp_id){
                return emp;
            }
        }
        return null;
    }

    @Override
    public void updateEmployee(int emp_id) {
        for(Employee emp: addEmployees){
            if(emp.getEmp_id()== emp_id){
                System.out.println("Do you want to update 1.Employee name 2.Employee Address? ");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter employee name to update: ");
                        emp.setEmp_name(sc.next());
                        System.out.println("Employee name is updated");
                        break;

                    case 2:
                        System.out.println("Enter employee address to update: ");
                        emp.setEmp_address(sc.next());
                        System.out.println("Employee address is updated");

                        break;
                    default:
                        System.out.println("Choose Option 1 or 2");
                }// end of switch
            }// end of if
        }//end of for
    }

    @Override
    public void deleteEmployee(int emp_id) {
        int j = 0;
        for (Employee emp: addEmployees){
            if(emp.getEmp_id() == emp_id){
                ++j;
               addEmployees.remove(emp);
                System.out.println("Employee information is deleted");
               break;
            }
        }
        if (j == 0){
            System.out.println("Employee record is not found");
        }

    }
}
