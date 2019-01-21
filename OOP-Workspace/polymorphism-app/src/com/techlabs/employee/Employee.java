package com.techlabs.employee;

public abstract class Employee {
	protected int employeeNumber;
	protected String name;
	protected int basicSalary;
	protected double salary;
	protected double perks;
	protected String role;
	protected double pa;
	protected double ha;
	protected double ta;

	public Employee(String employeeName, int employeeNumber) {
		this.name = employeeName;
		this.employeeNumber = employeeNumber;
		this.basicSalary = 20000;
	}

	public double getPerks() {
		return perks;
	}

	public String getRole() {
		return role;
	}

	public String getName() {
		return name;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public double getPa() {
		return pa;
	}

	public double getHa() {
		return ha;
	}

	public double getTa() {
		return ta;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public double getSalary() {
		return salary;
	}

	public abstract void salary();
}