package com.techlabs.student.test;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("Prachit", "Khandagale", 7.12f);
		Student student1 = new Student("Vinod", "Sarode", 8.45f);
		Student student2 = new Student("Ajay", "Pandey", 8.20f);
		System.out.println(student.getRollNumber());
		System.out.println(student1.getRollNumber());
		System.out.println(student2.getRollNumber());
		System.out.println(student.getRollNumber());
		System.out.println(student1.getRollNumber());
		System.out.println(student2.getRollNumber());
	}

}
