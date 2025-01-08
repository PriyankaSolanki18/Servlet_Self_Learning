package com.attr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class s1
 */
@WebServlet("/s1")
public class s1 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public s1() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet S1</title>");
			out.println("</head>");
			out.println("<body>");
//			out.println("<h1>Servlet S1 at "+ request.getContextPath() + "</h1>");
			
			String n1=request.getParameter("n1");
			String n2=request.getParameter("n2");
			int nn1 = Integer.parseInt(n1);
			int nn2 = Integer.parseInt(n2);
			//add
			int s=nn1+nn2;
			
			//attribute set
			request.setAttribute("sum", s);
			
			//request forwarding using request dispatcher
			RequestDispatcher rd= request.getRequestDispatcher("s2");
			rd.forward(request, response);
			
			out.println("</body>");
			out.println("</html>");
		}
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		processRequest(request,response);
	}
	
	@Override
	public String getServletInfo() {
		return "S1 servlet...";
	}

}
