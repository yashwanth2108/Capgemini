package com.example.question_5.Service;


import com.example.question_5.Model.Employee;
import com.example.question_5.Model.EmployeeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    ArrayList<Employee> employeeList = new ArrayList<>();


    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Optional<Employee> searchEmployee(Long empId) {

        return employeeRepository.findById(empId);
    }

    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }

    public ArrayList<Employee> findAllEmployee() {

        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

}
