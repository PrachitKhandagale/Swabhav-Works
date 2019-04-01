package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/summaryservlet")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummaryServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
		HttpSession session=request.getSession(); 
		ServletContext sessionContext=getServletContext();
		
		out.println("Session New Value : "+session.getAttribute("hitCounter"));
		out.println("Application New Value : "+sessionContext.getAttribute("hitCounter"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
