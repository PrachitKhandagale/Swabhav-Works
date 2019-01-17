package com.techlabs.student;

public class Student {
	private String firstName;
	private String lastName;
	private float cgpa;
	private static int countRollNumber;
	private int rollNumber;

	static {
		countRollNumber = 1001;
	}

	public Student(String firstName, String lastName, float cgpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.rollNumber = countRollNumber;
		countRollNumber++;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getCgpa() {
		return cgpa;
	}


}
