package com.jatin.project_01_08_employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeList empList = new EmployeeList();

        Scanner sc = new Scanner(System.in);

        int input = 0;

        do {
            printMenu();
            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    scanNewEmployeeDetails(sc, empList);
                    break;
                case 2:
                    empList.listAllEmployees();
                    break;
                case 3:
                    empList.listAllManagers();
                    break;
                case 4:
                    int empIdToDelete = scanEmpId(sc);
                    empList.deleteEmployee(empIdToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 5.");
            }

            System.out.println();

        } while (input != 5);

        sc.close();
    }

    private static void printMenu() {
        String menuFormat = "%2s. %-20s %n";
        String[] menuItems = {
                "Add an employee",
                "List all employees",
                "List all managers",
                "Delete an employee",
                "Exit"
        };
        System.out.println("======= Main Menu ==========");
        for (int i = 1; i <= menuItems.length; i++) {
            System.out.printf(menuFormat, i, menuItems[i - 1]);
        }
        System.out.print("Select an option (1-5): ");
    }

    private static int scanEmpId(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int empId = sc.nextInt();
        sc.nextLine();
        return empId;
    }

    private static void scanNewEmployeeDetails(Scanner sc, EmployeeList employeeList) {
        System.out.print("\nEnter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();
        if (employeeList.employeeExist(empId)) {
            System.out.println("Employee with same Id already exists!");
            return;
        }
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        String mobNo = sc.nextLine();
        System.out.print("Enter Salary: ");
        float salary = sc.nextFloat();
        sc.nextLine();
        employeeList.addEmployee(new Employee(empId, firstName, lastName, designation, mobNo, salary));
    }

}
