package org.spring.learning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 廖水生
 * @date   2022/2/13 16:16
 */

public class BookTests {

    @Test
    public void testAdd() {
        // 加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        // 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();

    }
}
