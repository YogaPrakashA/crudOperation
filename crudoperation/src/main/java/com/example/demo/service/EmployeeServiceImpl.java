package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Employee;

public interface EmployeeServiceImpl {

	public String insertEmployeeDetails(Employee employee);
	
	public List<Employee> getAllEmp();
	
	public Optional<Employee> getId(String id);
	
	public String deleteEmp(String name);
	
	public String updateEmpDetails(Employee emp);

	
}
