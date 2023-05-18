package home.bruce.lesson3;

import home.bruce.bean.Monkey;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet3")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 使用 spring 提供的 WebApplicationContext
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        resp.getWriter().println(context.getBean(Monkey.class));
    }

}
