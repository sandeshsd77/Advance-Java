import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/cookie")
public class CookieController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie cookie1  = new Cookie("Laptop", "macbook");
        Cookie cookie2 = new Cookie("mobile", "iphone");
        Cookie cookie3 = new Cookie("tablet", "ipad");

        cookie1.setMaxAge(1000000000);
        cookie2.setMaxAge(1000000000);
        cookie3.setMaxAge(1000000000);

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Good Morning "+ LocalDateTime.now());
    }
}
