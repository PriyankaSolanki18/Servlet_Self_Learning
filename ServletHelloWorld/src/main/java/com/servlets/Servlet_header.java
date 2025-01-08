package com.servlets;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_header")
public class Servlet_header extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("name");
		if(name==null) {
			name="";
		}
		Locale locale = request.getLocale();
		String languageTag = locale.toLanguageTag();
		String greeting;
		switch(languageTag) {
		case "fr":
			greeting="Bonjour";
			break;
		case "de":
			greeting="Guten";
			break;
		case "hi":
			greeting="नमस्ते";
			break;
		default:
			greeting="Hello";
			languageTag="en";
		}
		response.setHeader("Content-Language", languageTag);
		response.getWriter().println(greeting+" "+name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
