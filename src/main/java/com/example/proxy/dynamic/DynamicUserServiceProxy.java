package com.example.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangzhao on 2018/6/25.
 * Java 动态代理机制 Spring AOP 原理
 */
public class DynamicUserServiceProxy implements InvocationHandler
{
    //这个就是我们要代理的真实对象
    private Object target;

    //构造方法，给我们要代理的真实对象赋初值
    public DynamicUserServiceProxy(Object target)
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable
    {
        Object result = null;
        //在代理真实对象前我们可以添加一些自己的操作
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        //当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        result = method.invoke(target,args);
        //在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("事务结束。。。");
        return result;
    }
}
