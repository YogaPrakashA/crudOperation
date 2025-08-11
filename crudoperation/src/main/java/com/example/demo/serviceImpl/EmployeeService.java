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

			if (employee == null)
				return "Employee details empty";

			empList.add(employee);

			empList.stream()
					.forEach(emp -> System.out.println(emp.getName() + " " + emp.getRole() + " " + emp.getSalary()));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Insert successfully";
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

		return res ? name + "Your account deleted successfully. " : "Invalid User";

	}

	@Override
	public String updateEmpDetails(Employee emp) {
		String name = emp.getName() == null ? "" : emp.getName();
		int index = 0;

		if (name.trim().isEmpty())
			return "Invalid input";

		for (int i = 0; i < empList.size(); i++) {

			if (empList.get(i).getName().equals(emp.getName()))
				index = i;

		}

		if (emp.getName().equals(empList.get(index).getName())) {
			@SuppressWarnings("static-access")
			Employee updEmp = new Employee().builder().name(emp.getName()).role(emp.getRole()).salary(emp.getSalary())
					.build();

			empList.set(index, updEmp);

			return "Update success";
		}

		return "Invalid name";

	}

	public void sum1() {

		Integer totalSalary = empList.stream().filter(list -> list.getRole().equals("SSE"))
				.mapToInt(Employee::getSalary).sum();

		System.out.println("Total salary :: " + totalSalary);
	}

}
