package com.example.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangzhao on 2018/6/26.
 */
public class Hello {
    public static void main(String[] args) {
        Class<?> demo = null;
        try {
            demo = Class.forName("com.example.reflect.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //保存所有的接口
        Class<?> intes[] = demo.getInterfaces();
        for (int i = 0; i < intes.length; i++) {
            System.out.println("实现的接口   " + intes[i].getName());
        }


        try {
            Method method = demo.getMethod("sayChina");
            method.invoke(demo.newInstance());

            method = demo.getMethod("sayHello", String.class,int.class);
            method.invoke(demo.newInstance(),"boo",11);
        } catch (Exception e) {

        }
    }
}
