package com.techlabs.employee;

public class Accountant extends Employee {

	public Accountant(String name, int employeeNumber, String role) {
		super(name, employeeNumber);
		this.role = role;
		this.perks = 0.3 * basicSalary;
	}

	public double getPerks() {
		return perks;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salary = (basicSalary + (this.perks));
	}
}
