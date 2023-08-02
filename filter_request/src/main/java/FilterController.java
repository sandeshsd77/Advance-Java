import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
@WebFilter(urlPatterns = {"/first","/second"})
public class FilterController implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init ,method");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Security Filter");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("Security Filter request");

        filterChain.doFilter(servletRequest, servletResponse);
        printWriter.println("Security responce check");
    }

    public void destroy() {
        System.out.println("Filter destroy method");
    }
}
