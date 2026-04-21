package servlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VisitServlet")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("user_name");
        int count = 0;

        // 1. Get existing cookies to find 'visitCount'
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        // 2. Increment visit count
        count++;

        // 3. Create and configure cookies
        Cookie vCookie = new Cookie("visitCount", String.valueOf(count));
        Cookie nCookie = new Cookie("savedName", name);

        // 4. Demonstrate Expiry: Set cookies to expire in 30 seconds
        vCookie.setMaxAge(30); 
        nCookie.setMaxAge(30);

        // 5. Add cookies to the response
        response.addCookie(vCookie);
        response.addCookie(nCookie);

        // 6. Display Greeting
        out.println("<html><body>");
        if (count == 1) {
            out.println("<h2>Welcome, " + name + "!</h2>");
        } else {
            out.println("<h2>Welcome back, " + name + "!</h2>");
        }
        out.println("<h3>You have visited this page " + count + " times.</h3>");
        out.println("<p style='color:red;'>Note: Cookies will expire in 30 seconds of inactivity.</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}

