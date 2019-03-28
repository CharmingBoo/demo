/*
 *
 *  * 文 件 名:  MyRunnable.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-14 下午6:03
 *
 */

package com.example.thread;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class MyRunnable implements Runnable
{
    public void run()
    {
        methodOne();
    }

    public void methodOne()
    {
        int localVariable1 = 45;

        MySharedObject localVariable2 =
            MySharedObject.sharedInstance;

        //... do more with local variables.

        methodTwo();
    }

    public void methodTwo()
    {
        Integer localVariable1 = new Integer(99);

        //... do more with local variable.
    }

}




