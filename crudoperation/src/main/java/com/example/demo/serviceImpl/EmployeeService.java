package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Person;
import com.example.demo.service.EmployeeServiceImpl;

@Service
public class EmployeeService implements EmployeeServiceImpl {
	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee("prakash", "SSE", 20000),
			new Employee("Raj", "SSE", 21000), new Employee("Raj", "JE", 21000), new Employee("Raj", "JE", 21000)));

	@Override
	public String insertEmployeeDetails(Employee employee) {

		String response = "";

		try {

			if (employee == null) {
				response = "Employee details empty";
			} else {
				empList.add(employee);
				System.out.println(empList);
				response = "Insert successfully";
			}

			empList.stream()
					.forEach(emp -> System.out.println(emp.getName() + " " + emp.getRole() + " " + emp.getSalary()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return empList;
	}

	@Override
	public Optional<Employee> getId(String name) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = Optional.empty();
		emp = empList.stream().filter(empDetail -> empDetail.getName().equals(name)).findFirst();
		return emp;
	}

	@Override
	public String deleteEmp(String name) {
		boolean res = empList.removeIf(empList1 -> empList1.getName().equals(name));
		if (res)
			return "Deteleted success";
		else
			return "Deleted Unsuccess";
	}

	@Override
	public String updateEmpDetails(Employee emp) {
		String name = emp.getName() == null ? "" : emp.getName();
		String res = "";
		int index = 0;
		if (!name.trim().isEmpty()) {
			for (int i = 0; i < empList.size(); i++) {

				if (empList.get(i).getName().equals(emp.getName())) {
					index = i;
				}
			}
			if (empList.get(index).getName().equals(emp.getName())) {
				Employee updEmp = new Employee();
				updEmp.setName(emp.getName() == null ? empList.get(index).getName() : emp.getName());
				updEmp.setRole(emp.getRole() == null ? empList.get(index).getRole() : emp.getRole());
				updEmp.setSalary(emp.getSalary() == 0 ? empList.get(index).getSalary() : emp.getSalary());
				empList.set(index, updEmp);
				res = "Update success";
			} else {
				res = "Invalid name";
			}

		} else {
			res = "name is empty";
		}
		return res;

	}

	
	public void sum1() {
		
		Integer totalSalary = empList.stream().filter(list -> list.getRole().equals("SSE")).mapToInt(Employee::getSalary)
				.sum();
		
		System.out.println("Total salary :: "+ totalSalary);
	}
	

	/*
	 * public static void main(String[] args) { Person person = new Person("abc",
	 * "xyz", 100.0, null);
	 * 
	 * person.setRole(person.getRole()); }
	 */
	
}
