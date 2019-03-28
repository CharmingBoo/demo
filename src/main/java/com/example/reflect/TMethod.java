/*
 *
 *  * 文 件 名:  TMethod.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-30 下午7:31
 *
 */

package com.example.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/10/30]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class TMethod
{


        public static void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException,
            InvocationTargetException
        {
            Class<?> c = MethodClass.class;
            Field[] fields = c.getFields();
            Field[] declaredFields = c.getDeclaredFields();
            Object object = c.newInstance();
            Method[] methods = c.getMethods();
            Method[] declaredMethods = c.getDeclaredMethods();
            //获取methodClass类的add方法
            Method method = c.getMethod("add", int.class, int.class);
            //getMethods()方法获取的所有方法
            System.out.println("getMethods获取的方法：");
            for(Method m:methods)
                System.out.println(m);
            //getDeclaredMethods()方法获取的所有方法
            System.out.println("getDeclaredMethods获取的方法：");
            for(Method m:declaredMethods)
                System.out.println(m);

            System.out.println("----------------------");
            for(Field field : fields)
            {
                System.out.println(field);
            }

            for(Field field : declaredFields)
            {
                System.out.println(field);
            }
        }

    public static void main(String[] args)
        throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException,
        ClassNotFoundException
    {
        //调用方法
       Class<?> klass = MethodClass.class;
        //创建methodClass的实例
        Object obj = klass.newInstance();
        Method method = klass.getMethod("add",int.class,int.class);
        Object result = method.invoke(obj,1,4);
        System.out.println(result);

        testArray();

    }

    public static void testArray()
        throws ClassNotFoundException
    {
        Class<?> cls = Class.forName("java.lang.String");
        Object array = Array.newInstance(cls,25);
        //往数组里添加内容
        Array.set(array,0,"hello");
        Array.set(array,1,"Java");
        Array.set(array,2,"fuck");
        Array.set(array,3,"Scala");
        Array.set(array,4,"Clojure");
        //获取某一项的内容
        System.out.println(Array.get(array,3));
    }
}

