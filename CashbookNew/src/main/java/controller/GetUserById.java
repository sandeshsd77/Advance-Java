//package controller;
//
//import model.User;
//import service.UserService;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//@WebServlet("getuser")
//public class GetUserById {
//    UserService userService = new UserService();
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        int id = Integer.parseInt(request.getParameter("id"));
//       User userDeatils = userService.getUserById(id);
//
//        writer.println("<h1>Student Details</h2>");
//
//        writer.println(userDeatils.getName() +" "+ userDeatils.getEmail() +" "+ userDeatils.getPhone() +" "+ userDeatils.getUsername());
//
//    }
//}
