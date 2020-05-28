package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Simple servlet that implements doPost and doGet
 * The doPost takes two parameters (login and password) and displays them.
 */
@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class SimpleServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("This resource is not available directly.");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head></head><body>");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        out.println("<h1>Super Secret Login Information</h1>");
        out.println("<p>Login: " + login + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
    }
}
