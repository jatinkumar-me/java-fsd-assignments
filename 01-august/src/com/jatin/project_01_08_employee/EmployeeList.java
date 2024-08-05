package com.jatin.project_01_08_employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * EmployeeList
 */
public class EmployeeList {

    private List<Employee> list;
    final String tableFormat = "| %-5s | %-10s | %-10s | %-15s | %-12s | %-10s |%n";

    public EmployeeList() {
        this.list = new ArrayList<>();

        // Adding placeholder data
        list.add(new Employee(1, "John", "Doe", "Manager", "1234567890", 75000.50f));
        list.add(new Employee(2, "Jane", "Smith", "Developer", "1234567891", 65000.75f));
        list.add(new Employee(3, "Robert", "Brown", "Analyst", "1234567892", 60000.80f));
        list.add(new Employee(4, "Emily", "Davis", "Designer", "1234567893", 70000.90f));
        list.add(new Employee(5, "Michael", "Wilson", "Tester", "1234567894", 58000.60f));
        list.add(new Employee(6, "Anna", "White", "Manager", "1234567895", 80000.00f));
    }

    public boolean employeeExist(int empId) {
        for (Employee employee : list) {
            if (empId == employee.getEmpId()) {
                return true;
            }
        }
        return false;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            return;
        }
        if (employeeExist(employee.getEmpId())) {
            System.out.println("Employee with Id" + employee.getEmpId() + " already exists!");
            return;
        }
        list.add(employee);
        System.out.println("1 Employee successfully added");
    }

    private void listEmployees(List<Employee> list) {
        printTableHeader();
        for (Employee employee : list) {
            System.out.format(tableFormat, employee.getEmpId(), employee.getFirstName(), employee.getLastName(),
                    employee.getDesignation(), employee.getMobNo(), String.format("%.2f", employee.getSalary()));
        }
        printTableFooter(list.size());
    }

    public void listAllEmployees() {
        listEmployees(list);
    }

    public void listAllManagers() {
        List<Employee> managers = list.stream()
                .filter(employee -> "Manager".equals(employee.getDesignation()))
                .collect(Collectors.toList());
        listEmployees(managers);
    }

    public void deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                iterator.remove();
                System.out.println("Employee with ID " + empId + " deleted successfully.");
                return;
            }
        }

        System.out.println("Employee with ID " + empId + " Not found!");
    }

    private void printTableHeader() {
        System.out.format("---------------------------------------------------------------------------------%n");
        System.out.format("| empId | firstName  | lastName   | designation     | mobNo        | salary     |%n");
        System.out.format("---------------------------------------------------------------------------------%n");
    }

    private void printTableFooter(int total) {
        String footerFormat = "| %-77s |%n";
        System.out.format("---------------------------------------------------------------------------------%n");
        String str = total == 0 ? "No employee found, please press '1' to add new employee" : "Total " + total;
        System.out.format(footerFormat, str);
        System.out.format("---------------------------------------------------------------------------------%n");
    }
}
