package com.priyanka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sendr1")
public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//		PrintWriter out = res.getWriter();
//		out.println("Hello from servelet 1");
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

//		int sum = num1+num2;		
//		out.println("Sum : "+sum);
		
		res.sendRedirect("sendr2?num1="+num1+"&num2="+num2);  // url re-writing
		
	}
}
