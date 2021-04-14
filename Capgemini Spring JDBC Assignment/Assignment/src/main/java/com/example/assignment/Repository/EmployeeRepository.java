package com.example.assignment.Repository;


import com.example.assignment.DAO.ServiceInterface.EmployeeDaoSupportService;

import com.example.assignment.DAO.ServiceInterface.EmployeeNamedParameterDaoSupportService;
import com.example.assignment.Model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");



    EmployeeDaoSupportService employeeDaoSupportService = (EmployeeDaoSupportService) applicationContext.getBean("employeeDaoSupportService");
    EmployeeNamedParameterDaoSupportService employeeNamedParameterDaoSupportService = (EmployeeNamedParameterDaoSupportService) applicationContext.getBean("employeeNamedParameterDaoSupportService");



    // Operation Performed

    // question 1
    public String addEmployee(Employee employee)
    {
        employeeDaoSupportService.insert(employee);
        return "1 Row Updated in DataBase";
    }

    // question 2
    public String addEmployees(Employee employee)
    {
        employeeNamedParameterDaoSupportService.insert(employee);
        return "1 Row Updated in DataBase";
    }

    // question 3
    public List<Employee> findAllEmployee()
    {
        return employeeDaoSupportService.findAllEmployee();
    }

    // question 4
    public List<Employee> findAllEmployees()
    {
        return employeeDaoSupportService.findAllEmployees();
    }

    // question 5
    public Employee findByEmployeedId(int emp_id){return employeeDaoSupportService.findByEmployeedId(emp_id);}

    // question 6
    public Employee findByEmployeeId(int empId)
    {
        return employeeDaoSupportService.findByEmployeeId(empId);
    }

    // question 7
    public long getCount(){return employeeDaoSupportService.getCount();}

    // question 8
    public List<Employee> findAllEmployeeS(){return employeeDaoSupportService.findAllEmployeeS();}
}
