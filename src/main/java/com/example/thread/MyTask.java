/*
 *
 *  * 文 件 名:  MyTask.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-29 下午3:52
 *
 */

package com.example.thread;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class MyTask implements Runnable
{
    private int taskNum;

    public MyTask(int num)
    {
        this.taskNum = num;
    }

    @Override
    public void run()
    {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
