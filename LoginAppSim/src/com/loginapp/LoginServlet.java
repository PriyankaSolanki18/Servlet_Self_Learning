package com.loginapp;

import java.util.Scanner;

public class LoginServlet {

    // Hardcoded valid credentials (username: admin, password: password123)
    private static final String VALID_USERNAME = "priyanka";
    private static final String VALID_PASSWORD = "123";

    // Simulated "doPost" method to check username and password
    public String doPost(String username, String password) {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            return "Login Successful!";
        } else {
            return "Login Denied. Incorrect username or password.";
        }
    }

    // Main method to simulate user input through the console
    public static void main(String[] args) {
        // Create a scanner to get user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Instantiate LoginServlet and process the credentials
        LoginServlet loginServlet = new LoginServlet();
        String response = loginServlet.doPost(username, password);

        // Display the result of the login attempt
        System.out.println(response);

        // Close the scanner
        scanner.close();
    }
}
