package com.dygstudio.studyspring.instance;

import com.dygstudio.studyspring.instance.constructor.Bean1;
import com.dygstudio.studyspring.instance.static_factory.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/17-15:54
 * @Description:
 */
public class TestInstance {
    public static void test1(){
        String xmlPath = "com/dygstudio/studyspring/instance/constructor/beans1.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
        System.out.println(bean1);
    }
    public static void test2(){
        String xmlPath = "com/dygstudio/studyspring/instance/static_factory/beans2.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Bean2 bean = (Bean2)applicationContext.getBean("bean2");
        System.out.println(bean);
    }
    public static void test3(){
        String xmlPath = "com/dygstudio/studyspring/instance/factory/beans3.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean3"));
    }
}
