package org.spring.learning.aop.annotaion;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 廖水生
 * @date   2022/2/27 18:57
 */
@Component
@Aspect
public class UserProxy {
    /**
     * 前置通知
     */
    @Before(value = "execution(* org.spring.learning.aop.annotaion.User.add(..))")
    public void before() {
        System.out.println("before...................");
    }

    /**
     * 前置通知
     */
    @Around(value = "execution(* org.spring.learning.aop.annotaion.User.add(..))")
    public Object before(ProceedingJoinPoint pjp) {
        System.out.println("Around start...................");
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("Around end...................");
        return proceed;
    }
}
