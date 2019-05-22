/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.study.springJDBC;

public class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;
    private String jobDescription;
    private Address officeAddress;

    public Employee(){
        this.employeeId = "";
        this.employeeName = "";
        this.salary = 0;
        this.jobDescription = "";
    }

    public Employee(String employeeId, String employeeName, double salary, String jobDescription) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.jobDescription = jobDescription;
    }

    public Employee(String employeeId, String employeeName, double salary, String jobDescription, Address officeAddress) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.officeAddress = officeAddress;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", jobDescription=" + jobDescription + ", officeAddress=" + officeAddress + '}';
    }
    
    
}
