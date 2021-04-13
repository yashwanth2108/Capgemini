package com.example.assignment_1.Repository;

import com.example.assignment_1.DAO.ServiceInterface.EmployeeNamedParameterDaoSupportService;
import com.example.assignment_1.DAO.Impl.EmployeeNameParameterNamedParameterDaoSupportServiceImpl;
import com.example.assignment_1.DAO.ServiceInterface.EmployeeDaoSupportService;
import com.example.assignment_1.Model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

//    @Autowired
//    JdbcTemplate jdbcTemplate;

    EmployeeDaoSupportService employeeDaoSupportService = (EmployeeDaoSupportService) applicationContext.getBean("employeeDaoSupportService");

    EmployeeNamedParameterDaoSupportService employeeNamedParameterDaoSupportService = (EmployeeNamedParameterDaoSupportService) applicationContext.getBean("employeeNamedParameterDaoSupportService");

    public String addEmployee(Employee employee)
    {
        employeeDaoSupportService.insert(employee);
        return "1 Row Updated in DataBase";
    }

    public String addEmployees(Employee employee)
    {
        employeeNamedParameterDaoSupportService.insert(employee);
        return "1 Row Updated in DataBase";
    }

    public Employee findByEmployeeId(int empId)
    {
        return employeeDaoSupportService.findByEmployeeId(empId);
    }

//    public List<String> findAllEmployeeName()
//    {
//        return new ArrayList<>(jdbcTemplate.queryForList("select name from employee;", String.class));
//    }
    public List<Employee> findAllEmployee()
    {
        return employeeDaoSupportService.findAllEmployee();
    }
    public List<Employee> findAllEmployees()
    {
        return employeeDaoSupportService.findAllEmployees();
    }
}
