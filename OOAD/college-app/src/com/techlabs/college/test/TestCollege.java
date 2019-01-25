package com.techlabs.college.test;

import java.util.List;

import com.techlabs.college.Branch;
import com.techlabs.college.EngineeringCollege;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class TestCollege {

	public static void main(String[] args) {
		Professor professor=new Professor(1, "Wadala","10/01/1981 ");
		Professor professor1=new Professor(2, "Dombivali","21/03/1990");
		Professor professor2=new Professor(3, "Ambernath", "30/10/1965");
		EngineeringCollege eCollege=new EngineeringCollege();
		
//		EngineeringCollege eCollege1=new EngineeringCollege();
		eCollege.addProfessor(professor);
		eCollege.addProfessor(professor1);
		eCollege.addProfessor(professor2);
		
		Student student=new Student(1, "Kalyan", "06/06/1988", Branch.IT);
		Student student1=new Student(2, "Dadar", "07/08/1989", Branch.COMPUTER);
		Student student2=new Student(3, "Vashi", "05/04/1995", Branch.EXTC);
		
		
		eCollege.addStudent(student);
		eCollege.addStudent(student1);
		eCollege.addStudent(student2);
		
		printDetails(eCollege);
		
		
//		System.out.println(eCollege);
		//System.out.println(eCollege1);
		
	}
	
	public static void printDetails(EngineeringCollege college) {
		List<Student> listStudent=college.getStudents();
		List<Professor> listProfessor=college.getProfessors();
		System.out.println("Students Details:");
		for(Student stud:listStudent) {
			System.out.println(stud);
		}
		System.out.println("Professors Details:");
		for(Professor prof:listProfessor) {
			System.out.println(prof);
		}
	}

}
