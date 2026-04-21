package visitcounterservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VisitCounterServlet")
public class VisitCounterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Retrieve name from form or existing cookie
        String name = request.getParameter("userName");
        int count = 0;
        
        // 1. Get existing cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
                if (name == null && c.getName().equals("savedUser")) {
                    name = c.getValue();
                }
            }
        }
        
        // 2. Increment visit count
        count++;
        
        // 3. Create/Update cookies
        Cookie nameCookie = new Cookie("savedUser", name);
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(count));
        
        // 4. Set Expiry: Demonstrate expiry by setting age to 60 seconds
        nameCookie.setMaxAge(60); 
        visitCookie.setMaxAge(60);
        
        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // 5. Generate Response
        out.println("<html><body>");
        if (count == 1) {
            out.println("<h1>Welcome, " + name + "!</h1>");
        } else {
            out.println("<h1>Welcome back, " + name + "!</h1>");
        }
        out.println("<h3>You have visited this page " + count + " times.</h3>");
        
        // 6. Display list of all cookies
        out.println("<h4>Active Cookies List:</h4><table border='1'><tr><th>Name</th><th>Value</th></tr>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td></tr>");
            }
        }
        out.println("</table>");
        
        out.println("<p style='color:red;'>Cookies will expire in 60 seconds of inactivity.</p>");
        out.println("<a href='index.html'>Logout/Reset</a>");
        out.println("</body></html>");
    }
}
