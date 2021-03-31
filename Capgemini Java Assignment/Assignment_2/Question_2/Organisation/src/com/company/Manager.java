package com.company;
public class Manager extends Employee
{
    int incentive;

    Manager(int Emp_id,String Emp_name,int Emp_age,String Emp_Type,double salary,int bonus, int incentive)
    {
        super(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus);
        this.incentive = incentive;
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    void FinalSalary()
    {
        super.setSalary(super.getSalary()+super.getBonus()+getIncentive());
    }
    public String toString()
    {
        return "Employee ID : "+super.getEmp_id()+"\nName : "+super.getEmp_name()+"\nAge : "+super.getEmp_age()+"\nSalary : "+super.getSalary()+"\nEmployee Bonus : "+super.getBonus()+"\nEmployee Type : "+super.getEmp_Type()+"\n Employee Incentive : "+this.getIncentive();
    }
}