package resultservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            // Retrieve Parameters
            String roll = request.getParameter("rollno");
            String name = request.getParameter("studentname");
            int m1 = Integer.parseInt(request.getParameter("sub1"));
            int m2 = Integer.parseInt(request.getParameter("sub2"));
            int m3 = Integer.parseInt(request.getParameter("sub3"));
            int m4 = Integer.parseInt(request.getParameter("sub4"));
            int m5 = Integer.parseInt(request.getParameter("sub5"));

            // Server-side validation
            if(m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100) { // Add for all subs
                response.sendRedirect("index.jsp");
                return;
            }

            // Calculation Logic
            double avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
            String status = (m1 > 40 && m2 > 40 && m3 > 40 && m4 > 40 && m5 > 40) ? "PASS" : "FAIL";

            // Setting attributes for JSP
            request.setAttribute("roll", roll);
            request.setAttribute("name", name);
            request.setAttribute("avg", avg);
            request.setAttribute("status", status);

            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
            
        } catch (Exception e) {
            response.sendRedirect("index.jsp");
        }
    }
}