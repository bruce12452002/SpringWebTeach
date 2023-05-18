package home.bruce.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Objects;

//@WebListener
public class MyServletContextListener2 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("sce listener2");

        final String springConfig = sce.getServletContext().getInitParameter("contextConfigLocation");
        System.out.println("config==>" + springConfig);
        if (Objects.nonNull(springConfig)) {
            if (springConfig.startsWith("classpath")) {
                int index = springConfig.indexOf(":");
                sce.getServletContext().setAttribute("context",
                        new ClassPathXmlApplicationContext(springConfig.substring(index + 1)));
            }
        }
    }
}
