package com.example.assignment.DAO.Impl;



import com.example.assignment.DAO.ServiceInterface.EmployeeDaoSupportService;
import com.example.assignment.Model.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        String sql = "select * from employee";
        List<Employee> list = getJdbcTemplate().query(sql,new EmployeeResultSetExtractor());
        for(Employee employee1 : list)
        {
            if(employee1.getEmployee_id()==empId)
                return employee1;
        }
        return new Employee(000,"Null",00,"null",000,"null");
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

    @Override
    public Employee findByEmployeedId(int emp_id)
    {
        String sql = "select * from employee";
        return getJdbcTemplate().query(sql,new BeanPropertyRowMapper<Employee>()).stream().filter(p -> p.getEmployee_id() == emp_id).toList().get(0);
    }


    @Override
    public long getCount()
    {
        String sql = "select count(employee_id) as count from employee ";
        Map<String,Object> map = getJdbcTemplate().queryForMap(sql);
        return (long) map.get("count");
    }

    @Override
    public List<Employee> findAllEmployeeS()
    {
        String sql = "select * from employee";
        return getJdbcTemplate().query(sql,new EmployeeResultSetExtractor());
    }
}
