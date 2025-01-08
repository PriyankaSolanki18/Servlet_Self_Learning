package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		System.out.println("This is GET method...");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>This is GET method of MyServlet...</h2>");
		out.println(new Date().toString());
	}
}
