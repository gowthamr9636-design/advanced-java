package visittrackerservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VisitTrackerServlet")
public class VisitTrackerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("userName");
        int count = 0;
        
        // 1. Read existing cookies to find visitCount
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }
        
        // 2. Increment count
        count++;
        
        // 3. Create Cookies for Name and Count
        Cookie nCookie = new Cookie("user", name);
        Cookie vCookie = new Cookie("visitCount", String.valueOf(count));
        
        // 4. Set Expiry: 60 seconds (Demonstrates expiry)
        nCookie.setMaxAge(60); 
        vCookie.setMaxAge(60);
        
        // 5. Add cookies to response
        response.addCookie(nCookie);
        response.addCookie(vCookie);

        // 6. Display Greeting and Table
        out.println("<html><body>");
        if (count == 1) {
            out.println("<h2>Welcome, " + name + "!</h2>");
        } else {
            out.println("<h2>Welcome back, " + name + "!</h2>");
        }
        out.println("<h3>You have visited this page " + count + " times.</h3>");
        
        out.println("<h4>Active Cookie List & Set Values:</h4>");
        out.println("<table border='1'><tr><th>Cookie Name</th><th>Value</th></tr>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td></tr>");
            }
        } else {
            out.println("<tr><td colspan='2'>No cookies found (First visit)</td></tr>");
        }
        out.println("</table>");
        
        out.println("<p style='color:red;'>Note: Cookies will expire in 60 seconds of inactivity.</p>");
        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
