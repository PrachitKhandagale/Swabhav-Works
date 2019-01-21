package com.techlabs.serializedeserialize;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int age;
	private float cgpa;

	public Student(String name, int age, float cgpa) {
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getCgpa() {
		return cgpa;
	}

}
