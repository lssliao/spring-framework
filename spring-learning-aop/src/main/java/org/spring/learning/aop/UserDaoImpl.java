package org.spring.learning.aop;

/**
 * @author 廖水生
 * @date   2022/2/27 17:59
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add 方法调用了");
        return a + b;
    }

    @Override
    public int update(String id) {
        return 0;
    }
}
