import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setting response content type
        response.setContentType("text/html");
        
        // Retrieve username and password from request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple hard-coded validation (username: admin, password: password123)
        if ("admin".equals(username) && "123".equals(password)) {
            // Successful login
            PrintWriter out = response.getWriter();
            System.out.println("<html><body>");
            System.out.println("<h2>Login Successful!</h2>");
            System.out.println("<p>Welcome, " + username + "!</p>");
            System.out.println("</body></html>");
        } else {
            // Login failed
            PrintWriter out = response.getWriter();
            System.out.println("<html><body>");
            System.out.println("<h2>Login Denied</h2>");
            System.out.println("<p>Invalid username or password. Please try again.</p>");
            System.out.println("<a href='login.jsp'>Back to Login</a>");
            System.out.println("</body></html>");
        }
    }
}
