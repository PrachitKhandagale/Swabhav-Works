package com.techlabs.student.test;

import com.techlabs.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("Prachit","Khandagale",7.12f);
		System.out.println("Number of student:"+student.getCount());
		System.out.println("Head Count:"+Student.headCount());
		Student student1 = new Student("Vinod","Sarode",8.45f);
		System.out.println("Number of student:"+student1.getCount());
		System.out.println("Head Count:"+Student.headCount());
		Student student2 = new Student("Ajay","Pandey",8.20f);
		System.out.println("Number of student:"+student2.getCount());
		System.out.println("Head Count:"+Student.headCount());
		
	}
	public static void printDetails(Student student) {
		System.out.println("First Name:"+student.getFirstName()+"\nLast Name:"
				+student.getLastName()+"\nCGPA:"+student.getCgpa());
	}

}
