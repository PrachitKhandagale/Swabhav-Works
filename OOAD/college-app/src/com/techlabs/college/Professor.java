package com.techlabs.college;

import java.text.DateFormat;

public class Professor extends Person implements ISalariedEmployee {
	private double totalSalary;
	private double hra;

	public Professor(int id, String address, String dob) {
		super(id, address, dob);
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public double getHra() {
		return hra;
	}
	

	@Override
	public void calculateSalary() {
		hra = 0.4 * basicSalary;
		totalSalary = basicSalary + hra;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
