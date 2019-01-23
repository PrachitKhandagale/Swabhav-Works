package com.techlabs.college;

import java.util.ArrayList;
import java.util.List;

public class EngineeringCollege {

	List<Student> students = new ArrayList<Student>();
	List<Professor> professors = new ArrayList<Professor>();

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void addProfessor(Professor professor) {
		this.professors.add(professor);
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Professor> getProfessors() {
		return professors;
	}
	
	@Override
	public String toString() {
		return "Student:"+this.students.toString()+"\nProfessor:"+this.professors.toString();
	}
	

}
