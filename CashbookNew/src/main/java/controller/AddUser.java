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

@WebServlet("/user")
public class AddUser extends HttpServlet {
    UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(id, name, email, phone, username, password);

        userService.addUser(user);
        PrintWriter writer = resp.getWriter();
        writer.println("User Added Succesfully");

        // Forward the request to the Welcome servlet
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
//        requestDispatcher.forward(req, resp);

    }
}
