/*
 *
 *  * 文 件 名:  ThreadLocalDemo.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-12 上午11:07
 *
 */

package com.example.thread;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class ThreadLocalDemo
{
    public static void main(String[] args) throws InterruptedException {
        int threads = 3;
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        InnerClass innerClass = new InnerClass();
        for(int i = 1; i <= threads; i++) {
            new Thread(() -> {
                for(int j = 0; j < 4; j++) {
                    innerClass.add(String.valueOf(j));
                    innerClass.print();
                }
                innerClass.set("hello world");
                countDownLatch.countDown();
            }, "thread - " + i).start();
        }
        countDownLatch.await();
    }

    private static class InnerClass {
        public void add(String newStr) {
            StringBuilder str = Counter.counter.get();
            Counter.counter.set(str.append(newStr));
        }
        public void print() {
            System.out.printf("Thread name:%s , ThreadLocal hashcode:%s, Instance hashcode:%s, Value:%s\n",
                Thread.currentThread().getName(),
                Counter.counter.hashCode(),
                Counter.counter.get().hashCode(),
                Counter.counter.get().toString());
        }
        public void set(String words) {
            Counter.counter.set(new StringBuilder(words));
            System.out.printf("Set, Thread name:%s , ThreadLocal hashcode:%s,  Instance hashcode:%s, Value:%s\n",
                Thread.currentThread().getName(),
                Counter.counter.hashCode(),
                Counter.counter.get().hashCode(),
                Counter.counter.get().toString());
        }
    }
    private static class Counter {
        private static ThreadLocal<StringBuilder> counter = new ThreadLocal<StringBuilder>() {
            @Override
            protected StringBuilder initialValue() {
                return new StringBuilder();
            }
        };
    }
}
