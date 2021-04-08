package com.example.question_9;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class Employee implements InitializingBean , DisposableBean {
    private int empId;
    private String empName;
    private double empSalary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    private void initBean() {
        System.out.println("Initializing bean");
    }

    private void destroyBean() {
        System.out.println("Destroying bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface - Initializing bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Interface - Destroying bean");
    }
}
