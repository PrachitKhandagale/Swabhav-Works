package com.techlabs.employee.test;

import com.techlabs.employee.Accountant;
import com.techlabs.employee.Developer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		Manager manager = new Manager("Prachit", 1, "Manager");
		printPaySlip(manager);

		Accountant accountant = new Accountant("Ajay", 2, "Accountant");
		printPaySlip(accountant);

		Developer developer = new Developer("Vinod", 3, "Developer");
		printPaySlip(developer);
	}

	public static void printPaySlip(Employee employee) {
		employee.salary();
		System.out.println("Employee's role : " + employee.getRole());
		System.out.println("salary : " + employee.getSalary());
		if (employee.getHa() > 0) {
			System.out.println("House rentanl allowance : " + employee.getHa());
		}
		if (employee.getPa() > 0) {
			System.out.println("Performance allowance : " + employee.getPa());
		}
		if (employee.getTa() > 0) {
			System.out.println("Travel rentanl allowance : " + employee.getTa());
		}
		if (employee.getPerks() > 0) {
			System.out.println("Perks : " + employee.getPerks());
		}
		System.out.println("\n");

	}

}
