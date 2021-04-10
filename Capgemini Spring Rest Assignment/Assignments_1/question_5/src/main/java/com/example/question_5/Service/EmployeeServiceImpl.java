package com.example.question_5.Service;

import com.example.question_5.Model.Employee;
import com.example.question_5.Model.EmployeeList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeList  employees = new EmployeeList();
    ArrayList<Employee> employeeList = employees.getEmployeesList();

    @Override
    public String addEmployee(Employee employee) {
        employeeList.add(employee);
        return "---- Employee Added Successfully ----";
    }

    @Override
    public String searchEmployee(Long empId) {

        for(Employee employee : employeeList)
        {
            if(employee.getEmployeeId().equals(empId))
                return employee.toString();
        }

        return "There is no Employee related to this ID "+empId;
    }

    @Override
    public String deleteEmployee(Long empId) {
        int size = employeeList.size();
        employeeList.removeIf(employee -> employee.getEmployeeId().equals(empId));
        employees.setEmployeesList(employeeList);
        if(employeeList.size()==size)
            return "There is no Employee related to this ID "+empId;
        else
            return "---- Employee Deleted Successfully ----";
    }

    @Override
    public ArrayList<Employee> finAllEmployee() {
        return employeeList;
    }

    @Override
    public String updateEmployeeDetails(Employee employee) {
        int i = 0;
        for(Employee emp : employeeList)
        {
            if(employee.getEmployeeId().equals(emp.getEmployeeId()))
            {
                employeeList.set(i,employee);
                return "---- Employee Updated Successfully ----";
            }
            i++;
        }
        return "There is no Employee Id Related To this Data";
    }
}
