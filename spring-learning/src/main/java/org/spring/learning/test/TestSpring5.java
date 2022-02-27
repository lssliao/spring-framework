package org.spring.learning.test;

import org.spring.learning.Book;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 廖水生
 * @date   2022/2/13 15:46
 */
public class TestSpring5 {

    public static void main(String[] args) {
        new TestSpring5().testAdd();
    }

    public void testAdd() {
        // 加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();

    }

}
