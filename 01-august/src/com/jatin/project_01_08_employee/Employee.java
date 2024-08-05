package com.jatin.project_01_08_employee;

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private String designation;
    private String mobNo;
    private float salary;

    /**
     * @param empId
     * @param firstName
     * @param lastName
     * @param designation
     * @param mobNo
     * @param salary
     */
    public Employee(int empId, String firstName, String lastName, String designation, String mobNo, float salary) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
        this.mobNo = mobNo;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}
