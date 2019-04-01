package com.techlab.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/students")
public class StudentsController extends HttpServlet {
	public StudentsController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentsService studentsService = new StudentsService();
		ArrayList<Student> studentList = studentsService.getStudentBOList();
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		for(Student student:studentList) {
			//Student student = (Student)studentObj;
			printWriter.println(student.getName()+"..."+student.getCgpa()+"..."+student.getRollNo());
		}
		request.setAttribute("studentDetails", studentList);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/students.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}