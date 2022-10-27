import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setCharacterEncoding("Utf-8");
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    System.out.println(username);
        if ("lsc".equals(username) && "123".equals((password))) {
            resp.sendRedirect("/text14_war_exploded/Welcome.html");
        }else {
            resp.sendRedirect("/text14_war_exploded/Login.html");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
