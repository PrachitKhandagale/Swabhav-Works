package com.techlabs.prolinklist.test;

import com.techlabs.prolinklist.LinkList;
import com.techlabs.prolinklist.Student;

public class TestNode {
	public static void main(String[] args) {
		LinkList<Integer> list = new LinkList<Integer>(1);
		//list.add(1);
		list.add(2);
		list.add(3);
		//System.out.println("List Display:");
		list.display();
		
		list.add(5);
		list.remove(2);
		//System.out.println("Afetr Add and Remove List display:");
		list.display();
		
		Student student1=new Student("Prachit");
		Student student2=new Student("Vinod");
		Student student3=new Student("Ajay");
		LinkList<Student> studentList=new LinkList<Student>(student1);
		//studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		System.out.println("Students:");
		studentList.display();
		System.out.println("After add and remove:");
		Student student4=new Student("Gaurang");
		studentList.add(student4);
		studentList.remove(student3);
		studentList.display();
	}
}
