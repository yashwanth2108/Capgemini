package com.example.assignment_1;

import com.example.assignment_1.DAO.ServiceInterface.EmployeeNamedParameterDaoSupportService;
import com.example.assignment_1.DAO.ServiceInterface.EmployeeDaoSupportService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	EmployeeNamedParameterDaoSupportService employeeNamedParameterDaoSupportService;
	EmployeeDaoSupportService employeeDaoSupportService;


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}