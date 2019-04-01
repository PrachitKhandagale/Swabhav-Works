package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WelcomeServlet() {
		super();
		System.out.println("Welcome servlet inside constructor");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append(" ").append(request.getContextPath());
		System.out.println("Welcome servlet inside doGet");
		PrintWriter out = response.getWriter();
		String name=request.getParameter("developer");
        
        for(int i = 1; i <=6; i++) { 
           if(name!=null && !name.equals("null") && !name.equals("")){
           out.println("<h"+i+">Welcome to Servlet, "+name+"</h"+i+">");
        } 
        else{
           out.println("<h"+i+">Welcome to Servlet</h"+i+">");
        }
       }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("Welcome servlet inside doPost");
	}

}
