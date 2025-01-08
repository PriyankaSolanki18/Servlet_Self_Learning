package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;

public class FirstServlet implements Servlet{
	//Life cycle methods:-
	
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
		System.out.println("Creating Servlet...");
	}
	
	public void service(ServletRequest req, ServletResponse resp) throws IOException, ServletException{
		System.out.println("Servicing...");
		//set the content type of the response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>This is the output from servlet method</h1>");
		out.println("<h4>Today's date and time is : "+new Date().toString()+"</h4>");
	}
	
	public void destroy() {
		System.out.println("Going to destroy servlet object...");
	}
	
	//Non life cycle methods:-
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This servlet is created by Priyanka Solaknki";
	}
	
}
