package com.company;

public class Employee {
    private int Emp_Id;
    private String EmpName;
    private int EmpSalary;


    public Employee(int emp_Id, String empName, int empSalary) {
        Emp_Id = emp_Id;
        EmpName = empName;
        EmpSalary = empSalary;
    }

    public int getEmp_Id() {
        return Emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        Emp_Id = emp_Id;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(int empSalary) {
        EmpSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Emp_Id=" + Emp_Id +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSalary=" + EmpSalary +
                '}';
    }
}
