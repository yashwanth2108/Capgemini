package com.example.assignment.DAO.Impl;


import com.example.assignment.Model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;


public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();

        employee.setEmployee_id(resultSet.getInt("employee_id"));
        employee.setEmployee_name(resultSet.getString("name"));
        employee.setAge(resultSet.getInt("age"));
        employee.setDesignation(resultSet.getString("Designation"));
        employee.setDept_code(resultSet.getInt("Dept_code"));
        employee.setManager(resultSet.getString("Manager"));
        return employee;
    }
}
