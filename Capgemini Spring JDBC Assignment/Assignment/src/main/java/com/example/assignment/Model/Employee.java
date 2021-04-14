package com.example.assignment.Model;


public class Employee {

    private int employee_id;
    private String employee_name;
    private int age;
    private String designation;
    private int dept_code;
    private String manager;

    public Employee(int employee_id, String employee_name, int age, String designation, int dept_code, String manager) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.age = age;
        this.designation = designation;
        this.dept_code = dept_code;
        this.manager = manager;
    }
    public Employee()
    {

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getDept_code() {
        return dept_code;
    }

    public void setDept_code(int dept_code) {
        this.dept_code = dept_code;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", dept_code=" + dept_code +
                ", manager='" + manager + '\'' +
                '}';
    }
}
