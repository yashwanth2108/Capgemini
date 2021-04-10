package com.example.question_5.Model;

import java.util.Random;


public class Employee {

    private Long employeeId;
    private String employeeName;
    private String employeeDesignation;
    private Double employeeSalary;
    private String employeeDepartment;

    static Long generate = 1000000L;

    public Employee(String employeeName, String employeeDesignation, Double employeeSalary, String employeeDepartment) {
        this.employeeId = generate++;
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                '}';
    }
}
