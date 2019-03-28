/*
 *
 *  * 文 件 名:  CircularQueue.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-2-19 下午4:21
 *
 */

package com.example.queue;

/**
 * 循环队列
 * @author wangzhao
 * @version [版本号, 2019/2/19]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class CircularQueue
{
    private String [] items;
    private int n;

    private int head = 0;
    private int tail = 0;

    public CircularQueue(int capacity)
    {
        items = new String[capacity];
        n = capacity;
    }

    public boolean enqueue(String item)
    {
        if((tail+1)%n == head)
        {
            return false;
        }
        items[tail]= item;
        tail = (tail+1)%n;
        return true;
    }

    public String dequeue()
    {
        if(head == tail)
        {
            return null;
        }
        String ret = items[head];
        head = (head+1)%n;
        return ret;
    }

}
