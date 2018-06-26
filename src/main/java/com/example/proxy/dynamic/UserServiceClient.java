package com.example.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wangzhao on 2018/6/25.
 */
public class UserServiceClient
{
    public static void main(String[] args)
    {
        //我们要代理的真实对象
        UserService userServiceImpl = new UserServiceImpl();
        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new DynamicUserServiceProxy(userServiceImpl);

        UserService userService =
                (UserService) Proxy.newProxyInstance(handler.getClass().getClassLoader(), userServiceImpl.getClass().getInterfaces(), handler);

        System.out.println(userService.getClass().getName());
        userService.addUser();
        userService.editUser();
    }
}
