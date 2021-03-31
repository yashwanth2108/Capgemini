package com.company;
public class Labour extends Employee
{
    int Overtime_hours;
    int OverTime_Benifit_per_hour = 100;

    public int getOvertime_hours() {
        return Overtime_hours;
    }

    public void setOvertime_hours(int overtime_hours) {
        Overtime_hours = overtime_hours;
    }

    public int getOverTime_Benifit_per_hour() {
        return OverTime_Benifit_per_hour;
    }

    public void setOverTime_Benifit_per_hour(int overTime_Benifit_per_hour) {
        OverTime_Benifit_per_hour = overTime_Benifit_per_hour;
    }

    Labour(int Emp_id, String Emp_name, int Emp_age, String Emp_Type, double salary, int bonus, int Overtime)
    {
        super(Emp_id,Emp_name,Emp_age,Emp_Type,salary,bonus);
        this.Overtime_hours=Overtime;
    }

    public String toString()
    {
        return "Employee ID : "+super.getEmp_id()+"\nName : "+super.getEmp_name()+"\nAge : "+super.getEmp_age()+"\nSalary : "+super.getSalary()+"\nEmployee Bonus : "+super.getBonus()+"\nEmployee Type : "+super.getEmp_Type()+"\nEmployee Overtime hours : "+this.getOvertime_hours()+"\nOvertime benifit per hours : "+this.getOverTime_Benifit_per_hour();
    }

    void FinalSalary()
    {
        super.setSalary(super.getSalary()+super.getBonus()+getOverTime_Benifit_per_hour()*getOvertime_hours());
    }
}