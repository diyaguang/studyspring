package com.dygstudio.studyspring.aspectj.xml;

import com.dygstudio.studyspring.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/25 9:42
 * @Description:
 */
public class TestXmlAspectJ {
    public static void test(){
        String xmlPath =  "com/dygstudio/studyspring/aspectj/xml/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.addUser();
    }
}
