package com.example.assignment.DAO.ServiceInterface;

import com.example.assignment.Model.Employee;

import java.util.List;

public interface EmployeeNamedParameterDaoSupportService {
    public void insert(Employee employee);
    public Employee findByEmployeeId(int empId);
    public List<Employee> findAllEmployee();
}
