package com.dygstudio.studyspring.jdk;

import com.dygstudio.studyspring.aspect.MyAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18 16:50
 * @Description:
 */
public class JdkProxy implements InvocationHandler {
    private UserDao userDao;
    //创建代理方法
    public Object createProxy(UserDao userDao){
        this.userDao = userDao;
        ClassLoader classLoader = JdkProxy.class.getClassLoader();  //创建类加载器
        Class[] clazz = userDao.getClass().getInterfaces();  //被代理对象实现的所有接口
        return Proxy.newProxyInstance(classLoader,clazz,this);  //使用代理类，进行增强，返回的是代理后的对象
    }

    /*
    * 所有动态代理类的方法调用，都会交由 invoke 方法去处理
    * proxy 被代理后的对象
    * method 将要被执行的方法信息（反射）
    * args 执行方法时需要的参数
    * */
    @Override
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        MyAspect myAspect = new MyAspect();  //声明切面
        myAspect.check_Permissions(); //前增强
        Object obj = method.invoke(userDao,args);   //在目标类上调用方法，传入参数
        myAspect.log();  //后增强
        return obj;
    }
}
