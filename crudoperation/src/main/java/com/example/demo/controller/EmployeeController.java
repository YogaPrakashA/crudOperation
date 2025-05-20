package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Person;
import com.example.demo.serviceImpl.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	 EmployeeService employeeService;

	@PostMapping("/insert")
	public String insertEmp(@RequestBody Employee employee) {
		String empRes = "";
		try {
			empRes = employeeService.insertEmployeeDetails(employee);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return empRes;
	}

	@GetMapping("/getallemp")
	public List<Employee> getAllEmp() {
		List<Employee> getEmpList = new ArrayList<>();
		try {
			getEmpList = employeeService.getAllEmp();

		} catch (Exception e) {
			// TODO: handle exception
		}
		return getEmpList;
	}

	@PostMapping("/getonerecord")
	public Optional<Employee> getId(@RequestParam String name) {
		Optional<Employee> empDetail = Optional.empty();
		try {
			empDetail = employeeService.getId(name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return empDetail;
	}

	@PostMapping("/delete")
	public String deleteEmp(@RequestParam String name) {
		String empDetail = "";
		try {
			empDetail = employeeService.deleteEmp(name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return empDetail;
	}

	@PutMapping("/update")
	public String updateEmp(@RequestBody Employee emp) {
		String res = "";
		Employee emp454 = new Employee();
		try {
			res = employeeService.updateEmpDetails(emp);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}

	@GetMapping("/gettotal")
	public void sum1() {

		employeeService.sum1();

	}

	@PostMapping("/save")
	public void validateMandatory() {
		employeeService.sum1();

	}

}
