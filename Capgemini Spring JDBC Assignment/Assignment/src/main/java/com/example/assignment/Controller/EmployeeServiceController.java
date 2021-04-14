package com.example.assignment.Controller;

import com.example.assignment.Model.Employee;
import com.example.assignment.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeServiceController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping(path = "/addEmployees")
    public String addEmployees(@RequestBody Employee employee){
        return employeeRepository.addEmployees(employee);
    }

    @PostMapping(path = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeRepository.addEmployee(employee);
    }

    @GetMapping(path = "/findAllEmployee")
    public List<Employee> findAllEmployee()
    {
        return employeeRepository.findAllEmployee();
    }

    @GetMapping(path = "/findAllEmployees")
    public List<Employee> findAllEmployees()
    {
        return employeeRepository.findAllEmployees();
    }

    @GetMapping(path = "/findByEmployeeId/{empId}")
    public Employee findByEmployeeId(@PathVariable int empId)
    {
        return employeeRepository.findByEmployeeId(empId);
    }

}
