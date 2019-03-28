/*
 *
 *  * 文 件 名:  ThreadPoolDemo.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-29 上午10:58
 *
 */

package com.example.thread;

import java.util.concurrent.*;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class ThreadPoolDemo
{
    public static void main(String[] args)
    {
        /*ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10, 200,TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<Runnable>(5));

        for (int i = 0; i<15 ;i++)
        {
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }*/
        ThreadPoolDemo threadPoolDemo = new ThreadPoolDemo();
        threadPoolDemo.tExecutorFuture();
    }

    public void tExecutor()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdownNow();
        System.out.println("Main run");
    }

    public void tExecutorFuture()
    {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        future.cancel(true);
        System.out.println("Main run");
    }

}
