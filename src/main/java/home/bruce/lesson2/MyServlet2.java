package home.bruce.lesson2;

import home.bruce.bean.Monkey;
import org.springframework.context.ApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 自己寫的 WebApplicationContext
        ApplicationContext context = WebApplicationContextUtil.getWebApplicationContext(req.getServletContext());
        resp.getWriter().println(context.getBean(Monkey.class));
    }

}
