package com.techlabs.employee;

public class Developer extends Employee {

	public Developer(String name, int employeeNumber, String role) {
		super(name, employeeNumber);
		this.role = role;
		this.pa = 0.4 * basicSalary;
	}

	public double getPa() {
		return pa;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salary = (basicSalary + (this.pa));
	}

}
