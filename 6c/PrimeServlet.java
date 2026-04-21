package primeservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/checkPrime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        int n = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        // Prime Logic
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        out.println("<html><body>");
        if (isPrime) {
            out.println("<h2 style='color:green;'>" + n + " is a Prime Number.</h2>");
        } else {
            out.println("<h2 style='color:red;'>" + n + " is NOT a Prime Number.</h2>");
        }
        out.println("<a href='index.html'>Check Another Number</a>");
        out.println("</body></html>");
    }
}

