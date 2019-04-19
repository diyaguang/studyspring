package com.dygstudio.studyspring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18 11:30
 * @Description:
 */
public class AnnotationTest {
    public static void test(){
        String xmlPath = "com/dygstudio/studyspring/annotation/beans6.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        ((UserController)applicationContext.getBean("userController")).save();
    }
}
