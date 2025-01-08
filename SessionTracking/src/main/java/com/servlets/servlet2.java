package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public servlet2() {
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
			
			//getting all the cookies
			Cookie[] cookies=request.getCookies(); //space are not allowed in cookies variable i.e., Priya Sol instead we can use Priya_Sol or just Priya. In cookies we can only store textual information
			
			boolean f=false;
			String name = "";
			
			if(cookies == null) {
				out.println("<h1>You are new user submit your name</h1>");
				return;
			}else {
				for(Cookie c: cookies) {
					String tname = c.getName();
					if(tname.equals("user_name")) {
						f=true;
						name = c.getValue();
					}
				}
			}
			
			if(f) {
//			String name=request.getParameter("name");
			out.println("<h1>Hello, " + name + " Welcome-Back to my website..</h1>");
			out.println("<h1>Thank You!!!</h1>");
			}else {
				out.println("<h1>You are new user and submit your name</h1>");
			}
			
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
