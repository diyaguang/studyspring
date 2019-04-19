package com.dygstudio.studyspring.cglib;

import com.dygstudio.studyspring.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/19 9:41
 * @Description:
 */
public class CglibProxy implements MethodInterceptor {
    //代理方法
    public Object createProxy(Object target){
        Enhancer enhancer = new Enhancer();  //创建一个动态类对象
        enhancer.setSuperclass(target.getClass());  //确定需要增强的类，设置其父类
        enhancer.setCallback(this);  //添加回调函数
        return enhancer.create();  //返回创建的代理类
    }

    /*
    * proxy CGLib 根据指定父类生成的代理对象，method拦截的方法，args来接方法的参数数组
    * methodProxy 方法的代理对象，用于执行父类的方法
    * */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable{
        MyAspect myAspect = new MyAspect();
        myAspect.check_Permissions();
        Object obj = methodProxy.invokeSuper(proxy,args);
        myAspect.log();
        return obj;
    }
}
