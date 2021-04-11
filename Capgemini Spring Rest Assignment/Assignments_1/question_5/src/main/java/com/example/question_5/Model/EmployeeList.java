package com.example.question_5.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class EmployeeList {
    ArrayList<Employee> employeesList;
    public EmployeeList()
    {
        employeesList = new ArrayList<>(Arrays.asList(
                new Employee("Manav Verma","Software Engineer", 24000.0,"IT")
                ,new Employee("Rachit Verma","Software Engineer", 44000.0,"IT")
                ,new Employee("Rahul Verma","Software Engineer", 234000.0,"IT")
                ,new Employee("Rishabh Verma","Consultant", 24000.0,"IT")
                ,new Employee("Moni Verma","HR Manager", 255000.0,"NON IT")
                ,new Employee("Menu Verma","HR Manager", 334000.0,"NON IT")
                ,new Employee("Priyam Verma","Database Engineer", 24000.0,"IT")
        ));
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }
}
