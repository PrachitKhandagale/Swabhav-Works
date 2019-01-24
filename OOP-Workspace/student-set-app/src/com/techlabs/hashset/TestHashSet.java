package com.techlabs.hashset;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.student.Student;

public class TestHashSet {

	public static void main(String[] args) {
		Student student1=new Student(1,"Prachit","Khandagale");
		Student student2=new Student(1,"Prachit","Khandagale");
		Set<Student> students;
		students=new HashSet<Student>();
		students.add(student1);
		students.add(student1);
		students.add(student2);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(students.size());
	}
}
