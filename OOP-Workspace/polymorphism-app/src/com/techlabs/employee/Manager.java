package com.techlabs.employee;

public class Manager extends Employee {

	public Manager(String name, int employeeNumber, String role) {
		super(name, employeeNumber);
		this.role = role;
		this.ha = 0.6 * basicSalary;
		this.ta = 0.6 * basicSalary;
	}

	public double getHa() {
		return ha;
	}

	public double getTa() {
		return ta;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salary = (basicSalary + (this.ha + this.ta));
	}

}