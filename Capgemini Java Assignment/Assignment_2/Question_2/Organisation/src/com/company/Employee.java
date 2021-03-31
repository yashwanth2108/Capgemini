package com.company;

class Employee
{
    private int Emp_id;
    private String Emp_name;
    private int Emp_age;
    private String Emp_Type;
    private double salary;
    private int bonus;

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public int getEmp_age() {
        return Emp_age;
    }

    public void setEmp_age(int emp_age) {
        Emp_age = emp_age;
    }

    public String getEmp_Type() {
        return Emp_Type;
    }

    public void setEmp_Type(String emp_Type) {
        Emp_Type = emp_Type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    Employee(int Emp_id, String Emp_name, int Emp_age, String Emp_Type, double salary, int bonus)
    {
        this.Emp_id = Emp_id;
        this.Emp_name = Emp_name;
        this.Emp_age = Emp_age;
        this.Emp_Type = Emp_Type;
        this.salary = salary;
        this.bonus = bonus;
    }
    void FinalSalary()
    {
        this.salary = this.salary + this.bonus;
    }
}