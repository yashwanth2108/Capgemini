package com.example.assignment.DAO.Impl;



import com.example.assignment.DAO.ServiceInterface.EmployeeDaoSupportService;
import com.example.assignment.Model.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoSupportServiceImpl extends JdbcDaoSupport implements EmployeeDaoSupportService {
    @Override
    public void insert(Employee employee)
    {
        String sql = "INSERT INTO EMPLOYEE "+"(employee_id,name ,age,Designation,Dept_code,Manager) VALUES (?,?,?,?,?,?)";
        getJdbcTemplate().update(sql
                                , employee.getEmployee_id()
                ,employee.getEmployee_name()
                ,employee.getAge()
                ,employee.getDesignation()
                ,employee.getDept_code()
                ,employee.getManager());
    }

    @Override
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
    @Override
    public List<Employee> findAllEmployee()
    {
        String sql = "select * from employee";
        return getJdbcTemplate().query(sql,new EmployeeRowMapper());
    }
    @Override
    public List<Employee> findAllEmployees()
    {
        String sql = "select * from employee";
        return getJdbcTemplate().query(sql,new BeanPropertyRowMapper(Employee.class));
    }
}
