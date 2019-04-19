package com.dygstudio.studyspring.cglib;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/19 10:08
 * @Description:
 */
public class CglibTest {
    public static void test(){
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDao1 = (UserDao)cglibProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
