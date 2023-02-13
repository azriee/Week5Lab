
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import service.AccountService;

/**
 *
 * @author azriee
 */
public class LoginServlet extends HttpServlet {
HttpSession session;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("logout") != null){
            session.invalidate();
            session = request.getSession();
        }
        
        session = request.getSession();
        if(session.getAttribute("user") != null){
            response.sendRedirect("home");
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountService accountService = new AccountService();
        User user = accountService.login(request.getParameter("username"), request.getParameter("password"));
        session.setAttribute("user", user);
        if (user != null){
            response.sendRedirect("home");
            return;
        } else{
            request.setAttribute("message", "Invalid Login!");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

}
