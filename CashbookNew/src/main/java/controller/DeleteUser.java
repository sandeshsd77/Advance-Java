package controller;

import model.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/delete_user")
public class DeleteUser extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        // Delete the user by ID
//        User user =new User();
        userService.deleteUser(id);

        PrintWriter writer = resp.getWriter();
        writer.println("user deleted successfully");

        // Redirect to a success page or display a success message
//        resp.sendRedirect("/index.jsp");
    }
}
