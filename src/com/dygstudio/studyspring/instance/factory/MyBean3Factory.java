package com.dygstudio.studyspring.instance.factory;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/17-16:27
 * @Description:
 */
public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.println("bean3 工厂实例化中");
    }
    public Bean3 createBean(){
        return new Bean3();
    }
}
