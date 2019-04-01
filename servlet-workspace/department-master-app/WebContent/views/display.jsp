<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.*"%>

<%@page import="com.techlabs.model.Department"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/department-master-app/home">Back To Home</a><br><br>
<%
ArrayList<Department> result=(ArrayList<Department>)request.getAttribute("deptDetails");
out.println("<table border=1><tr><th>DEPTNO</th>"+"<th>DNAME</th>"+"<th>LOCATION</th></tr>"+"<br>");
for(Department dept:result){
	out.println("<tr><td>"+dept.getDeptno()+"</td><td>"+dept.getDname()+"</td><td>"+dept.getLocation()+"</td></tr>");
}
out.println("</table>");
%>


</body>
</html>