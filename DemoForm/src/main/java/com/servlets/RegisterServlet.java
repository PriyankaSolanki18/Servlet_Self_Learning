package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Welcome to Register Servlet</h2>");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String condition=req.getParameter("condition");
		
		//out.println(condition);
		
		if(condition != null) {
		if(condition.equals("checked")) {
			out.println("<h2>Name  : "+name+"</h2>");
			out.println("<h2>Password  : "+password+"</h2>");
			out.println("<h2>Email  : "+email+"</h2>");
			out.println("<h2>Gender : "+gender+"</h2>");
			out.println("<h2>Course  : "+course+"</h2>");
			
			//JDBC
			//data saved to DB
			RequestDispatcher rd = req.getRequestDispatcher("success"); //here "success" is the url pattern of another servlet where request has been forwarded
			rd.forward(req, res);
		}else {
			out.println("<h2>You have not accepted Terms & Conditions</h2>");
		}
		}
		else {
			out.println("<h2>You have not accepted Terms & Conditions</h2>");
			// to include output of index.html
			//get the object of request dispatcher
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			//include method - included the output of index.html file to this servlet if the check box is unchecked or the condition is equals to null
			rd.include(req, res); 
		}
	}
}
