package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/applicationservlet")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ApplicationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();  
//        HttpSession session=request.getSession(); 
		ServletContext session=getServletContext(); 
        Integer hitsCount = (Integer)session.getAttribute("hitCounter");

        if( hitsCount ==null || hitsCount == 0 ) {       
            hitsCount = 1;
        } else {
            hitsCount += 1;
        }
            session.setAttribute("hitCounter", hitsCount);
            out.println("Session Id : "+request.getSession().getId());
            out.println("Old Counter: "+(hitsCount-1));
            out.println("New Counter: "+hitsCount);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
