package com.demo.employee.service;

import org.springframework.stereotype.Service;

import com.demo.employee.entity.Employee;

@Service
public class EmployeeService {

	public Employee getEmployeeDetails() {
		Employee emp = new Employee();

		emp.setName("vignesh");
		emp.setSalary(24000);

		return emp;

	}
}
