package com.ems.details;

import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.pojo.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
    Scanner sc = new Scanner(System.in);
    EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
    public void empDetails(){
        while(true) {
            System.out.println("******************************************");
            System.out.println("    1. Add Employee");
            System.out.println("    2. View All Employee");
            System.out.println("    3. View Employee");
            System.out.println("    4. Update Employee");
            System.out.println("    5. Delete Employee");
            System.out.println("    6. Back ");
            System.out.println("******************************************");
            System.out.println(" ");

            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    daoImpl.addEmployee();
                    empDetails();
                    break;

                case 2:
                    List<Employee> viewEmployees = daoImpl.viewEmployees();
                    System.out.println("====================================================================");
                    System.out.println("E_ID\t E_NAME\t E_ADD\t E_EMAIL\t");
                    for(Employee emp: viewEmployees){
                        System.out.println(emp.getEmp_id()+"\t" + emp.getEmp_name()+"\t" + emp.getEmp_address() +"\t" +emp.getEmp_email());
                    }
                    empDetails();
                    break;

                case 3:
                    System.out.println("Enter the employee ID to view: ");
                    Employee emp = daoImpl.viewEmployee(sc.nextInt());
                    if(emp != null){
                        System.out.println(emp.getEmp_id()+"\t" + emp.getEmp_name()+"\t" + emp.getEmp_address() +"\t" +emp.getEmp_email());
                    }
                    else {
                        System.out.println("Employee Record is not found");
                    }
                    empDetails();
                    break;

                case 4:
                    System.out.println("Enter Employee ID:");
                    daoImpl.updateEmployee(sc.nextInt());
                    empDetails();
                    break;

                case 5:
                    System.out.println("Enter Employee ID:");
                    daoImpl.deleteEmployee(sc.nextInt();
                    empDetails();
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Choose between 1 to 6");


            }


        }
    }

}
