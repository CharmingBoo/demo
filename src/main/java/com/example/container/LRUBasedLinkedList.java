/*
 *
 *  * 文 件 名:  LRUBasedLinkedList.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-17 上午10:01
 *
 */

package com.example.container;

import javax.net.ssl.SNIHostName;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/17]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class LRUBasedLinkedList<T>
{
    /**
     * 默认链表容量
     */
    private static final Integer DEFAULT_CAPACITY = 10;

    /**
     * 头结点
     */
    private SNode<T> headNode;

    /**
     * 链表长度
     */
    private Integer length;

    /**
     * 链表容量
     */
    private Integer capacity;

    public LRUBasedLinkedList()
    {
        this.headNode = new SNode<>();
        this.capacity = DEFAULT_CAPACITY;
        this.length = 0;
    }

    public LRUBasedLinkedList(Integer capacity)
    {
        this.headNode = new SNode<>();
        this.capacity = capacity;
        this.length = 0;
    }

    private void add(T data)
    {
        SNode preNode = findPreNode(data);
        if(preNode != null)
        {

        }
        else
        {
            if(length>=this.capacity)
            {

            }
            insertElementAtBegin(data);
        }
    }

    /**
     * 链表头部插入节点
     * @param data
     */
    private void insertElementAtBegin(T data)
    {
        SNode next = headNode.getNext();
        headNode.setNext(new SNode(data,next));
        length++;
    }

    /**
     * 获取查找到元素的前一个结点
     * @param data
     * @return
     */
    private SNode findPreNode(T data)
    {
        SNode node = headNode;
        while (node.getNext()!=null)
        {
            if(data.equals(node.getNext().getElement()))
            {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }



    public class SNode<T>
    {
        private T element;

        private SNode next;

        public SNode(T element)
        {
            this.element = element;
        }

        public SNode(T element, SNode next)
        {
            this.element = element;
            this.next = next;
        }

        public SNode()
        {
            this.next = null;
        }

        public SNode getNext()
        {
            return next;
        }

        public void setNext(SNode next)
        {
            this.next = next;
        }

        public T getElement()
        {
            return element;
        }

        public void setElement(T element)
        {
            this.element = element;
        }
    }
}
