package com.techlabs.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.Student;

public class TestTreeSet {

	public static void main(String[] args) {
		Student student1=new Student(1,"Prachit","Khandagale");
		Student student2=new Student(2,"Ajay","Pandey");
		Student student3=new Student(3,"Vinod","Walkunde");
		Set<Student> students;
		students=new TreeSet<Student>(new FirstNameComparator());
		students.add(student1);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		Set<Student> students1;
		students1=new TreeSet<Student>(new LastNameComparator());
		students1.add(student1);
		students1.add(student1);
		students1.add(student2);
		students1.add(student3);
		
		//System.out.println(students.size());
		Comparator<Student> nameCompare=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFirstName().compareTo(o2.getFirstName()); 
			}
		};
		for(Student student:students) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
		System.out.println();
		for(Student student:students1) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
	}
}
