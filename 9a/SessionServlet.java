package sessionservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class SessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Get the current session or create a new one
        HttpSession session = request.getSession(true);
        
        // 2. Set session timeout to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 3. Manage Visit Count using session attributes
        Integer count = (Integer) session.getAttribute("visitCount");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        session.setAttribute("visitCount", count);

        // 4. Retrieve Session Tracking Information
        String sessionID = session.getId();
        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessedTime = new Date(session.getLastAccessedTime());

        // 5. Generate HTML Response
        out.println("<html><head><title>Session Tracking</title></head><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Information</th><th>Value</th></tr>");
        out.println("<tr><td>Session ID</td><td>" + sessionID + "</td></tr>");
        out.println("<tr><td>Session Creation Time</td><td>" + creationTime + "</td></tr>");
        out.println("<tr><td>Last Access Time</td><td>" + lastAccessedTime + "</td></tr>");
        out.println("<tr><td>Visit Count</td><td>" + count + "</td></tr>");
        out.println("</table>");
        out.println("<p>Session will expire after 1 minute of inactivity.</p>");
        out.println("<br><a href='index.html'>Refresh / Start New</a>");
        out.println("</body></html>");
    }
}
