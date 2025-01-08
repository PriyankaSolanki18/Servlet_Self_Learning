package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Get username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded user credentials for simplicity
        String validUsername = "user";
        String validPassword = "123";

        // Simple login logic
        if (username.equals(validUsername) && password.equals(validPassword)) {
            response.getWriter().println("Login Successful!");
        } else {
            response.getWriter().println("Login Denied!");
        }
    }
}
