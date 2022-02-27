package org.spring.learning.aop.test;

import org.spring.learning.aop.SpringConfig;
import org.spring.learning.aop.annotaion.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 廖水生
 * @date   2022/2/27 19:11
 */
public class TestAop {

    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(context.getApplicationName());
        User user = context.getBean("user", User.class);
        user.add();

    }

}
