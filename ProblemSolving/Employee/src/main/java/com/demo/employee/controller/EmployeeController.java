package com.demo.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.entity.Employee;
import com.demo.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/emp")
	public Employee getEmployeeDetails() {
		Employee employee= empService.getEmployeeDetails(); 
		return employee;
	}
}
