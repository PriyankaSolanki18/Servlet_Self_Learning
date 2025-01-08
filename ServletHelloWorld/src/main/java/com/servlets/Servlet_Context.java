package com.servlets;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_Context")
public class Servlet_Context extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ServletContext cxt = request.getServletContext();
		int tempCount=1;
		Object att=cxt.getAttribute("counter");
		if(att != null) {
			AtomicInteger count = (AtomicInteger)att;
			tempCount=count.incrementAndGet();
		}else {
			AtomicInteger count = new AtomicInteger(1);
			cxt.setAttribute("counter", count);
		}
		response.getWriter().println("Servlet count = "+tempCount);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
