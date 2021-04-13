package com.example.assignment_1.DAO;

import com.example.assignment_1.Model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public void insert(Employee employee);
    public Employee findByEmployeeId(int empId);
    public List<Employee> findAllEmployee();
}
