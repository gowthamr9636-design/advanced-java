package factorialservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/calculateFactorial")
public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Retrieve input
        int n = Integer.parseInt(request.getParameter("num"));
        long factorial = 1;

        // Factorial Logic
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Output Result
        out.println("<html><body>");
        out.println("<h2>Result:</h2>");
        out.println("<p>The factorial of " + n + " is: <b>" + factorial + "</b></p>");
        out.println("<a href='index.html'>Back</a>");
        out.println("</body></html>");
    }
}