package com.example.question_5.Controller;

import com.example.question_5.Model.Employee;
import com.example.question_5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeServiceController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping(path = "/searchEmployee/{empId}")
    public String searchEmployee(@PathVariable Long empId)
    {
        return employeeService.searchEmployee(empId);
    }

    @DeleteMapping(path = "/deleteEmployee/{empId}")
    public String deleteEmployee(@PathVariable String empId)
    {
        Long userId = Long.parseLong(empId);
        return employeeService.deleteEmployee(userId);
    }

    @GetMapping("/allEmployee")
    public ArrayList<Employee> finAllEmployee()
    {
        return (ArrayList<Employee>) employeeService.finAllEmployee();
    }

    @PostMapping(path = "/updateEmployee")
    public String updateEmployeeDetails(@RequestBody Employee employee)
    {
        return employeeService.updateEmployeeDetails(employee);
    }

}
