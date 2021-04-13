package com.example.assignment_1.DAO.Impl;


import com.example.assignment_1.DAO.EmployeeDAO;
import com.example.assignment_1.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class EmployeeDaoSupport extends JdbcDaoSupport {
    public void insert(Employee employee)
    {
        String sql = "INSERT INTO EMPLOYEE "+"(employee_id,name,age,Designation,Dept_code,Manager) VALUES (?,?,?,?,?,?)";
        getJdbcTemplate().update(sql
                , employee.getEmployee_id()
                ,employee.getEmployee_name()
                ,employee.getAge()
                ,employee.getDesignation()
                ,employee.getDept_code()
                ,employee.getManager());
    }

    public Employee findByEmployeeId(int empId)
    {
        String sql = "select * from employee where employee_id = ? ;";
        List<Employee> list = (List<Employee>) getJdbcTemplate().query(sql,new EmployeeRowMapper());
        for(Employee employee1 : list)
        {

            if(employee1.getEmployee_id()==empId)
                return employee1;
        }
        return new Employee(123,"Hello",24,"world",8080,"nature");
    }
    public List<Employee> findAllEmployee()
    {
        String sql = "select * from employee";

        assert getJdbcTemplate() != null;
        return getJdbcTemplate().query(sql,new EmployeeRowMapper());
    }
}
