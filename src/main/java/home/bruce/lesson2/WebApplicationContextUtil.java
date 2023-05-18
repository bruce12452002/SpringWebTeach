package home.bruce.lesson2;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtil {
    public static ApplicationContext getWebApplicationContext(ServletContext sc) {
        return (ApplicationContext) sc.getAttribute("context");
    }
}
