package com.example.question_5.Service;

import com.example.question_5.Model.Employee;

import java.util.List;

public interface EmployeeService {
    public String addEmployee(Employee employee);
    public String searchEmployee(Long empId);
    public String deleteEmployee(Long empId);
    public List<Employee> finAllEmployee();
    public String updateEmployeeDetails(Employee employee);
}
