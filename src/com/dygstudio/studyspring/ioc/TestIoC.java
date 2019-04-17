package com.dygstudio.studyspring.ioc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/17-11:51
 * @Description:
 */
public class TestIoC {
    public static void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        //userDao.say();
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.say();
    }

}
