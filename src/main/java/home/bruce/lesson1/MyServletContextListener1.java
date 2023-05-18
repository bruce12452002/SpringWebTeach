package home.bruce.lesson1;

import home.bruce.bean.Monkey;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//@WebListener
public class MyServletContextListener1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("sce listener1");
        sce.getServletContext().setAttribute("context", new ClassPathXmlApplicationContext("lesson1.xml"));
        sce.getServletContext().setAttribute("context", new AnnotationConfigApplicationContext(Monkey.class));
    }
}
