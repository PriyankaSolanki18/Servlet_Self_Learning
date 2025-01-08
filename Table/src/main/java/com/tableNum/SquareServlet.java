package com.tableNum;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		out.println("Hello to square!!");
		
		
		int k= (int)req.getAttribute("num");
		
		for(int i=1;i<=10;i++) {
			out.println(k+" * "+i+" = "+(k*i));
		}
		
		k = k*k;
		
		out.println("Suare of num : "+k);
		
		
	}
	
}
