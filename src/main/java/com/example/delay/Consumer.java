/*
 *
 *  * 文 件 名:  Consumer.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-18 下午7:54
 *
 */

package com.example.delay;

import java.util.concurrent.DelayQueue;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/9/18]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Consumer implements Runnable
{
    //延时队列
    private DelayQueue queue;

    public Consumer(DelayQueue queue)
    {
        this.queue = queue;
    }

    @Override public void run()
    {
        while (true) {
            try {
                Message take = (Message)queue.take();
                System.out.println("消费消息ID=="+ take.getId() + "消费消息内容==" + take.getBody());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //test延迟时队列发送消息
    public static void main(String[] args) {
        //创建延时队列
        DelayQueue queue = new DelayQueue();
        //添加延时队列消息，m1 延时3s
        Message m1 = new Message(1, "你好我是延迟队列消息1……", 3000);
        //添加延时队列消息， m2延时5s
        Message m2 = new Message(2, "你好我是延迟队列消息2……", 5000);
        //添加延时队列消息， m3延时10s
        Message m3 = new Message(3, "你好我是延迟队列消息3……", 10000);
        queue.offer(m1);
        queue.offer(m2);
        queue.offer(m3);
        //启动消费线程
        new Thread(new Consumer(queue)).start();
    }
}
