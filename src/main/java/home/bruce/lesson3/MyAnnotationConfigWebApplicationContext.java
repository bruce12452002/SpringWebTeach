package home.bruce.lesson3;

import home.bruce.bean.Monkey;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {
    public MyAnnotationConfigWebApplicationContext() {
        super();
        register(Monkey.class); // 裡面可寫 @ComponentScan
//        scan("home.bruce"); // 給 package 讓 spring 掃描也行
    }
}
