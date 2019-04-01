<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.techlab.student.Student"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<h1>Students Details</h1>
	<a href="http://localhost:8080/servlet-mvc-app/">Home Page</a>
	<br>
	<br>
	<a href="http://localhost:8080/servlet-mvc-app/login">Login</a>
	<br>
	<a href="http://localhost:8080/servlet-mvc-app/logout">LogOut</a>
	<br>
	<a href="http://localhost:8080/servlet-mvc-app/add">Add</a>
	<br>
	
	
	<% 
		ArrayList<Student> studentList = (ArrayList) request.getAttribute("studentDetails");
		for(Student student:studentList) {
			out.print("Name: "+student.getName()+"<br>CGPA: "+student.getCgpa()+"<br>RollNo.: "+student.getRollNo()+"<br><br>");
			out.print("<a href="+"http://localhost:8080/servlet-mvc-app/edit?rollNo="+student.getRollNo()+">Edit</a>&nbsp;&nbsp;");
			out.print("<a href="+"http://localhost:8080/servlet-mvc-app/delete?rollNo="+student.getRollNo()+">Delete</a><br><br>");
		}
	%>
	<br>
	
</body>
</html>