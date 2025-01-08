// Java program to show servlet example 
// Importing required Java libraries 
import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 

// Extend HttpServlet class 
@WebServlet("/slc")
public class ServletLC extends HttpServlet 
{ 
private String output; 
	
// Initializing servlet 
public void init() throws ServletException 
{ 
	output = "Advance Java Concepts"; 
} 

// Requesting and printing the output 
public void doGet(HttpServletRequest req, 
					HttpServletResponse res) 
	throws ServletException, IOException 
	{ 
		res.setContentType("text/html"); 
		PrintWriter out = res.getWriter(); 
		out.println(output); 
		
		String name = req.getParameter("name");
		out.println("Hello! welcome to IBM "+name);
	} 

	public void destroy() 
	{ 
		System.out.println("Over"); 
	} 
} 
