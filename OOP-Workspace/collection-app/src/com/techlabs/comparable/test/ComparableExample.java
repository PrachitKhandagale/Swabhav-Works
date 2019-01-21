package com.techlabs.comparable.test;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		Student student=new Student(1,"Prachit",24);
		Student student1=new Student(2,"Suchit",29);
		
		if(student.compareTo(student1)==0) {
			System.out.println("Both are of same age.");
		}
		if(student.compareTo(student1)>0) {
			System.out.println("Prachit is elder.");
		}
		else {
			System.out.println("Suchit is elder.");
		}
		
		StudentComparator studentComparator=new StudentComparator();
		if(studentComparator.compare(student,student1)==0) {
			System.out.println("Both are of same age.");
		}
		if(studentComparator.compare(student,student1)>0) {
			System.out.println("Prachit's age is greater.");
		}
		else {
			System.out.println("Suchit's age is greater.");
		}
	}
}
