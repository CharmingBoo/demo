/*
 *
 *  * 文 件 名:  NotThreadSafe.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-5 下午5:19
 *
 */

package com.example.thread;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/9/5]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class NotThreadSafe
{
    StringBuilder builder = new StringBuilder();

    public void add(String text){
        this.builder.append(text);
    }

    public void test()
    {
        NotThreadSafe sharedInstance = new NotThreadSafe();
        new Thread(new MyRunnable(sharedInstance)).start();
        new Thread(new MyRunnable(sharedInstance)).start();
    }

    public void safetest()
    {
        new Thread(new MyRunnable(new NotThreadSafe())).start();
        new Thread(new MyRunnable(new NotThreadSafe())).start();
    }

    public class MyRunnable implements Runnable
    {
        NotThreadSafe instance = null;

        public MyRunnable(NotThreadSafe instance){
            this.instance = instance;
        }

        public void run(){
            this.instance.add("some text");
        }
    }
}
