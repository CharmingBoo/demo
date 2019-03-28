/*
 *
 *  * 文 件 名:  LinkedStack.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-31 上午10:04
 *
 */

package com.example.stack;

/**
 * 基于链表实现栈结构
 * @author wangzhao
 * @version [版本号, 2019/1/31]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class LinkedStack
{
    private Node top = null;

    public void push(int value)
    {
        Node newNode = new Node(value,null);
        if(top == null)
        {
            top = newNode;
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop()
    {
        if(top == null)
        {
            return -1;
        }
        else
        {
            int value = top.getData();
            top = top.next;
            return value;
        }
    }

    public void printAll()
    {
        Node p = top;
        while (p!= null)
        {
            System.out.println(p.getData()+"-->");
            p = p.next;
        }
        System.out.println();
    }

    public static class Node
    {
        private int data;
        private Node next;

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public int getData()
        {
            return data;
        }
    }
}
