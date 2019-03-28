/*
 *
 *  * 文 件 名:  Box.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-2 上午10:06
 *
 */

package com.example.generic;

import javafx.util.Pair;

import java.util.Comparator;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/2]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Box<T>
{
    private T t;

    public T getT()
    {
        return t;
    }

    public void setT(T t)
    {
        this.t = t;
    }

    public static void main(String[] args)
    {
        testPair();
    }

    public static <M, N> boolean compare(Pair<M, N> p1, Pair<M, N> p2)
    {
        return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }

    public static void testPair()
    {
        Pair<Integer,String> pair1 = new Pair<>(1,"aaa");
        Pair<Integer,String> pair2 = new Pair<>(2,"bbb");
        System.out.println(compare(pair1,pair2));
    }

    public static <T extends Comparable<T> > int countGreaterThan(T[] anArray, T elem)
    {
        int count = 0;
        for(T e : anArray)
        {
            if(e.compareTo(elem)>0)
            {
                ++count;
            }
        }
        return count;
    }
}
