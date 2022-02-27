package org.spring.learning.aop.annotaion;

import org.springframework.stereotype.Component;

/**
 * 被增加的类
 * 
 * @author 廖水生
 * @date   2022/2/27 18:52
 */
@Component
public class User {

    public void add() {
        System.out.println("add ........");
    }
}
