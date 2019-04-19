package com.dygstudio.studyspring.factorybean;

import com.dygstudio.studyspring.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/19 14:28
 * @Description:
 */
public class ProxyFactoryBeanTest {
    public static void test(){
        String xmlPath = "com/dygstudio/studyspring/factorybean/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao)applicationContext.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}
