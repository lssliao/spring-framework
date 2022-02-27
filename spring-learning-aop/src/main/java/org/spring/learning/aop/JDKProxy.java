package org.spring.learning.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 廖水生
 * @date   2022/2/27 17:41
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class<?>[] interfacs = { UserDao.class };
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao o = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfacs,
                new UserDaoProxy(userDao));
        int result = o.update(1 + "");
        System.out.println("结果： " + result);

    }

    static class UserDaoProxy implements InvocationHandler {

        Object obj;

        public UserDaoProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            // 方法之前
            System.out.println("方法之前：" + method.getName() + "; 传递的参数" + Arrays.toString(args));

            // 被增强的方法执行
            Object res = method.invoke(obj, args);

            // 方法之后
            System.out.println("方法之后后：" + method.getName());

            return res;
        }
    }
}
