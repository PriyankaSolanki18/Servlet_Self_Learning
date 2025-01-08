package com.tableNum;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mul")
public class Table extends HttpServlet
{
	//In order to accept only post request we have different methods to use in place of service() method i.e., doPost() or doGet()

	//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
	//		
	//		}

//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
//		int num = Integer.parseInt(req.getParameter("num"));
//		for(int i=1;i<=10;i++) {
//			res.getWriter().println(num+" * "+i+" = "+(num*i));
//		}
//	}
//	
	
	
	
	/*
	 * to call a one servlet from another servlet we can use 2 methods
	 * 1. request dispatcher
	 * 2. redirect
	*/
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		int num = Integer.parseInt(req.getParameter("num"));
//		for(int i=1;i<=10;i++) {
//			res.getWriter().println(num+" * "+i+" = "+(num*i));
//		}
		
		//Q- How can i print content of this servlet first before it is 
		
		/*
		 * How to pass data from one servlet to another servlet
		 * it can be done using [ session management ]
		*/
		                //key  //value
		req.setAttribute("num", num);
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
	}
	
	//instead of writing same code twice in doPost and doGet method we can create a separate method and call them wherever required
	
}
