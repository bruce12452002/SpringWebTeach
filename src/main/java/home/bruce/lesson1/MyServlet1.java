package home.bruce.lesson1;

import home.bruce.bean.Monkey;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet1")
public class MyServlet1 extends HttpServlet {
    /**
     * 在開發專案時，會寫很多的 doXxx，這時每次都要 new XxxApplicationContext
     * 這樣會記憶體浪費，解法辦法是在一啟動伺服器時，就將相關的 bean 注入 spring 容器裡
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Monkey.class);
        resp.getWriter().println(context.getBean(Monkey.class));
    }

}
