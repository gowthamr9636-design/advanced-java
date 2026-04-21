package userdataservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        // Server-side validation
        if (username == null || username.isEmpty() || email == null || !email.contains("@")) {
            response.sendRedirect("index.jsp"); // Simple error handling
            return;
        }

        // Store data in request scope
        request.setAttribute("uname", username);
        request.setAttribute("uemail", email);
        request.setAttribute("udesignation", designation);

        // Forward to result.jsp
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}