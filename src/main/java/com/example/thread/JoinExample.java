/*
 *
 *  * 文 件 名:  JoinExample.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-7 下午5:28
 *
 */

package com.example.thread;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/7]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class JoinExample
{
    private class A extends Thread {
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread {

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

    public static void main(String[] args)
    {
        JoinExample example = new JoinExample();
        example.test();
    }
}
