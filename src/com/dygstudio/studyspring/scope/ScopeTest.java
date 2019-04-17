package com.dygstudio.studyspring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/17-16:46
 * @Description:
 */
public class ScopeTest {
    public static void test(){
        String xmlPath = "com/dygstudio/studyspring/scope/beans4.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("scope"));
        System.out.println(applicationContext.getBean("scope"));
    }
}
