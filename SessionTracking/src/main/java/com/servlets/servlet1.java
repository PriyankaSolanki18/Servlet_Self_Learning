package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public servlet1() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Servlet 1</title>");
			out.println("</head>");
			out.println("<body>");
			
			String name=request.getParameter("name");
			out.println("<h1>Hello, " + name + " Welcome to my website..</h1>");
			out.println("<h1><a href='servlet2'>Go to Servlet 2</a></h1>");
			
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		processRequest(request,response);
	}
	
	@Override
	public String getServletInfo() {
		return "servlet 1...";
	}

}
