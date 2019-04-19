package com.dygstudio.studyspring.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/19 11:57
 * @Description: 创建的切面类
 */
public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable{
        check_Permissions();
        Object obj = mi.proceed();  //执行目标方法
        log();
        return obj;
    }
    public void  check_Permissions(){
        System.out.println("模拟检查权限...");
    }
    public void log(){
        System.out.println("模拟记录日志...");
    }
}
