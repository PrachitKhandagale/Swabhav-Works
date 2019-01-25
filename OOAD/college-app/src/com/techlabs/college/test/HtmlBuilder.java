package com.techlabs.college.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.techlabs.college.Branch;
import com.techlabs.college.EngineeringCollege;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class HtmlBuilder {
	public static void main(String[] args)throws Exception {
		Professor professor = new Professor(1, "Wadala", "10/01/1981 ");
		Professor professor1 = new Professor(2, "Dombivali", "21/03/1990");
		Professor professor2 = new Professor(3, "Ambernath", "30/10/1965");
		EngineeringCollege eCollege = new EngineeringCollege();

//		EngineeringCollege eCollege1=new EngineeringCollege();
		eCollege.addProfessor(professor);
		eCollege.addProfessor(professor1);
		eCollege.addProfessor(professor2);

		Student student = new Student(1, "Kalyan", "06/06/1988", Branch.IT);
		Student student1 = new Student(2, "Dadar", "07/08/1989", Branch.COMPUTER);
		Student student2 = new Student(3, "Vashi", "05/04/1995", Branch.EXTC);

		eCollege.addStudent(student);
		eCollege.addStudent(student1);
		eCollege.addStudent(student2);

		printDetails(eCollege);

	}
	public static void printDetails(EngineeringCollege college) throws IOException {
		String fileName = "EngineerCollege.html";
		FileWriter filewriter = new FileWriter(fileName, false);
		List<Student> studentList = college.getStudents();
		List<Professor> professorsList = college.getProfessors();
		filewriter.append("<div><h1>College name :Enggnering College</h1>" + "\t"
				+ "<div>No of Students of college :" + college.getStudents().size() + "<br>" + "\t"
				+ "<div>No of Professos of college :" + college.getProfessors().size() + "<br>");
		filewriter.append("<h2>Student Details</h2>");

		for (Student student : studentList) {
			filewriter.append("<div> ID : " + student.getId() + "</div>" + "<div> Branch " + student.getBranch()
					+ "</div>" + "<div> Address : " + student.getAddress() + "</div>" + "<div> DOB : "
					+ student.getDob() + "</div>");
		}
		filewriter.append("<h2>Professor Details</h2>");
		for (Professor professor : professorsList) {
			filewriter.append("<div> ID : " + professor.getId() + "</div>" + "<div> Address : " + professor.getAddress()
					+ "</div>" + "<div> DOB : " + professor.getDob() + "</div>");
		}
		filewriter.close();
	}


}
