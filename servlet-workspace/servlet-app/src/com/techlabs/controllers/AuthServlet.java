package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authservlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AuthServlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Welcome servlet inside doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//		response.setContentType("text/html");  
		System.out.println("Welcome servlet inside doPost");
		
		PrintWriter out = response.getWriter();
		String username=request.getParameter("uname");
        String password=request.getParameter("password");
        if(username.equals("admin") && password.equals("admin")){
            out.print("<h1>Welcome to Swabhav "+username+"</h1>");
        }
        else{
            out.print("<p style='color: red'>Invalid User!! <a href='views/Login.html'>Login Again</a></p>");
        }
	}

}
