package com.ems.client;

import com.ems.details.EmployeeDetails;

import java.util.Scanner;

public class EmployeeClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("**********************************************************");
            System.out.println("       1. Employee");
            System.out.println("       2. Exit");
            System.out.println("**********************************************************");
            System.out.println(" ");

            System.out.println("Enter the choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    EmployeeDetails empDao = new EmployeeDetails();
                    empDao.empDetails();
                    break;

                case 2:
                    System.out.println("Thank you for using the application");
                    System.exit(0);

                default:
                    System.out.println("Please choose between 1 to 2");
            } // end of switch
        }// end of while
    }
}
