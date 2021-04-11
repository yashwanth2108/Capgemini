package com.example.question_5.Controller;


import com.example.question_5.Model.Employee;
import com.example.question_5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(path = "/addEmployee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping(path = "/searchEmployee/{empId}")
    public Optional<Employee> searchEmployee(@PathVariable Long empId) {

        return employeeService.searchEmployee(empId);
    }

    @DeleteMapping("/deleteEmployee/{empId}")
    public void deleteEmployee(@PathVariable Long empId) {
        employeeService.deleteEmployee(empId);
    }

    @GetMapping("/findAllEmployee")
    public ArrayList<Employee> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @PostMapping("/updateEmployee")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
    }



}
