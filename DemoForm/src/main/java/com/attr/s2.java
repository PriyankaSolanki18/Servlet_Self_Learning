package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s2
 */
@WebServlet("/s2")
public class s2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public s2() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet s2</title>");
			out.println("</head>");
			out.println("<body>");
			
			int nn1 = Integer.parseInt(request.getParameter("n1"));
			int nn2 = Integer.parseInt(request.getParameter("n2"));
			
			int p=nn1*nn2;
			
			//get attribute from request object
			int sum = (int)request.getAttribute("sum"); //because request will give object so typecasted into int
			
			out.println("<h1>");
			out.println("Sum = " + sum);
			out.println("<br>");
			out.println("Product = " + p);
			out.println("</h1>");
			
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
		return "S2 servlet...";
	}
}
