package com.dygstudio.studyspring.jdk;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18 17:22
 * @Description:
 */
public class JdkTest {
    public static void test(){
        JdkProxy jdkProxy = new JdkProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao)jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
