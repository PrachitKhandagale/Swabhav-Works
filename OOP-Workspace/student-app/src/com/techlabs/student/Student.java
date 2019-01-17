package com.techlabs.student;

public class Student {
	private String firstName;
	private String lastName;
	private float cgpa;
	private static int count;

	static {
		System.out.println("Static Block First Invoke");
		count = 0;
	}

	public Student(String firstName, String lastName, float cgpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		count++;
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

	public int getCount() {
		return this.count;
	}

	public static int headCount() {
		return count;
	}

}
