package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Employee {

	private String name;
	private String role;
	private Integer salary;

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
