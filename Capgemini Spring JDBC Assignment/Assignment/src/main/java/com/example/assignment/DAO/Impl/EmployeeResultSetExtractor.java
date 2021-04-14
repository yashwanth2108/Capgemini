package com.example.assignment.DAO.Impl;

import com.example.assignment.Model.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>> {

    @Override
    public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Employee> list1 = new ArrayList<Employee>();
        while (rs.next())
        {
            Employee employee = new Employee();
            employee.setEmployee_id(rs.getInt(1));
            employee.setEmployee_name(rs.getString(2));
            employee.setAge(rs.getInt(3));
            employee.setDesignation(rs.getString(4));
            employee.setDept_code(rs.getInt(5));
            employee.setManager(rs.getString(6));
            list1.add(employee);
        }
        return list1;
    }
}
