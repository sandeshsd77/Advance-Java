import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        if ("admin".equals(userName) && "admin".equals(password)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome");
            requestDispatcher.forward(req,resp);
        }
        else {
            resp.getWriter().println("<h2 style=\"color: red\"> Password not valid </h2>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.include(req,resp);
        }



    }
}
