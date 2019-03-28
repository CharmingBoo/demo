/*
 *
 *  * 文 件 名:  ArrayQueue.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-2-18 下午5:41
 *
 */

package com.example.queue;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/2/18]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class ArrayQueue
{
    //数组items 数组大小n
    private Object[] items;
    private int n = 0;

    //head表示队头下标 tail表示队尾下标
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int capacity)
    {
        items = new Object[capacity];
        n = capacity;
    }

    public boolean enqueue(Object item)
    {
        //如果 tail == n 表示队列已经满了
        if(tail == n)
        {
            // tail ==n && head==0，表示整个队列都占满了
            if(head == 0)
            {
               return false;
            }

            //数据迁移
            for(int i = head; i<tail; i++)
            {
                items[i-head] = items[i];
            }
            tail = tail - head;
            head = 0;
        }
        items[tail] = item;
        tail++;
        return true;
    }

    public Object dequeue()
    {
        //如果 head == tail 表示队列为空
        if(head == tail)
        {
            return false;
        }
        Object ret = items[head];
        head++;
        return ret;
    }
}
