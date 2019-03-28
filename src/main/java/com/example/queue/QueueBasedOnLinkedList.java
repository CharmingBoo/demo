/*
 *
 *  * 文 件 名:  QueueBasedOnLinkedList.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-2-19 上午11:30
 *
 */

package com.example.queue;

/**
 * 基于链表实现的队列
 *
 * @author wangzhao
 * @version [版本号, 2019/2/19]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class QueueBasedOnLinkedList
{
    private Node head = null;
    private Node tail = null;

    public void enqueue(String value)
    {
        if(tail == null)
        {
            Node node = new Node(value,null);
            head = node;
            tail = node;
        }
        else
        {
            tail.next = new Node(value,null);
            tail = tail.next;
        }
    }

    public String dequeue()
    {
        if(head == null)
        {
            return null;
        }
        String ret = head.getData();
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        return ret;
    }

    private static class Node
    {
        private String data;
        private Node next;

        public Node(String data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public String getData()
        {
            return data;
        }
    }
}
