package com.example.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * java reflect
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

        Class<?> klass = int.class;
        Class<?> ckassInt = Integer.TYPE;

        StringBuilder str = new StringBuilder("123");
        Class<?> slass = str.getClass();

        System.out.println(klass.isInstance(ckassInt));


        try
        {
            //create instance
            Class<?> c = String.class;
            //1.Object ss = c.newInstance();
            Constructor constructor = c.getConstructor(String.class);
            Object obj = constructor.newInstance("123");
            System.out.println(obj);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}
