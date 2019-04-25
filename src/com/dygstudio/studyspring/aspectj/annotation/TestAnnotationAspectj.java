package com.dygstudio.studyspring.aspectj.annotation;

import com.dygstudio.studyspring.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/25 11:10
 * @Description:
 */
public class TestAnnotationAspectj {
    public static void test(){
        String xmlPath =  "com/dygstudio/studyspring/aspectj/annotation/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.addUser();
    }
}
