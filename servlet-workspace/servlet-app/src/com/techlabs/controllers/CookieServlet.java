package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookieservlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CookieServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
		String bgcolor="red";
        Cookie cookie=new Cookie("bgcolor",bgcolor);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        out.println("<body bgcolor='<%= cookie.getValue() %>'>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
