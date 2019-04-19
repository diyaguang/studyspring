package com.dygstudio.studyspring.aspect;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18 16:17
 * @Description:
 */
public class MyAspect {
    public void check_Permissions(){
        System.out.println("模拟检查权限...");
    }
    public void log(){
        System.out.println("模拟记录日志...");
    }
}
