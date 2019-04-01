<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="http://localhost:8080/servlet-mvc-app/login" method="POST" name="loginForm" >
        Name:
        <input type="text" id="name" name="name" required>
        <br>
        Password:
        <input type="password" id="password" name="password" required>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>