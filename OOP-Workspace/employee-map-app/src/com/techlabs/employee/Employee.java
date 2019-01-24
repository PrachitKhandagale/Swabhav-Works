package com.techlabs.employee;

public class Employee implements Comparable<Employee> {
	private int deptNumber;
	private int empNumber;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(int deptNumber, int empNumber, String firstName, String lastName, double salary) {
		this.deptNumber = deptNumber;
		this.empNumber = empNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptNumber;
		result = prime * result + empNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (deptNumber != other.deptNumber)
			return false;
		if (empNumber != other.empNumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		if (o.getDeptNumber() == this.deptNumber && o.getEmpNumber() == this.empNumber) {
			return 0;
		}
		return 1;
	}
}
