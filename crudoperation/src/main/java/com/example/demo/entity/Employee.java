package com.example.demo.entity;

public class Employee {

	private String name;
	private String role;
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee(String name, String role, Integer salary) {
		super();
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
	
	

}
