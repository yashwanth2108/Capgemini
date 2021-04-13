package com.example.assignment_1.DAO.Impl;

import com.example.assignment_1.DAO.EmployeeDAO;
import com.example.assignment_1.Model.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EmployeeNameParameterDaoSupport extends NamedParameterJdbcDaoSupport implements EmployeeDAO {
    @Override
    public void insert(Employee employee) {
        String sql = "INSERT INTO EMPLOYEE "
                +"(EMPLOYEE_ID,NAME,AGE,DESIGNATION,DEPT_CODE,MANAGER) VALUES (:employeeId, :name, :age, :designation, :dept_code, :manager)";
        Map<String,Object> parameters = new HashMap<String,Object>();
        parameters.put("employeeId",employee.getEmployee_id());
        parameters.put("name",employee.getEmployee_name());
        parameters.put("age",employee.getAge());
        parameters.put("designation",employee.getDesignation());
        parameters.put("dept_code",employee.getDept_code());
        parameters.put("manager",employee.getManager());

        Objects.requireNonNull(getNamedParameterJdbcTemplate()).update(sql,parameters);
    }

    @Override
    public Employee findByEmployeeId(int empId) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployee() {
        return null;
    }

}
