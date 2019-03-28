/*
 *
 *  * 文 件 名:  SinglyLinkedList.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-29 下午2:37
 *
 */

package com.example.container;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class SinglyLinkedList
{
    /**
     * 判断是否为回文
     * @return
     */
    public boolean palindrome(Node head)
    {
        if(head == null)
        {
            return false;
        }
        else
        {
            System.out.println("---开始执行找到中间节点---");
            Node p = head;
            Node q = head;

            if(p.next == null)
            {
                System.out.println("---只有一个元素---");
                return true;
            }
            if(q.next!= null && q.next.next != null)
            {
                p = p.next;
                q = q.next.next;
            }
            System.out.println("---开始判断中间结点，是否为奇数偶数---");

            Node reverseNode = null;
            if(q.next == null)
            {
                //p为整个链表的中点，且链表为奇数
                reverseNode = reverseLinkList(p.next);
            }
            else
            {
                reverseNode = reverseLinkList(p.next);
            }

            while(reverseNode!=null)
            {
                if(reverseNode.getData() == head.getData())
                {
                    reverseNode = reverseNode.next;
                    head = head.next;
                }
                else
                {
                    break;
                }
            }
            if(reverseNode == null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


    /**
     * 反转链表
     * 方法1：就地反转法
     * @param p
     * @return
     */
    public Node reverseLinkList(Node p)
    {
        if(p == null)
        {
            return p;
        }
        Node dummy = new Node(-1,p);
        Node prev = dummy.next;
        Node pCur = prev.next;
        while (pCur != null)
        {
            prev.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = prev.next;
        }
        return dummy.next;
    }

    /**
     * 反转链表
     * 方法2：新建链表，头节点插入法
     * @param p
     * @return
     */
    public Node reverseLinkWithHead(Node p)
    {
        if(p == null)
        {
            return null;
        }
        Node dummy = new Node(-1,null);
        Node pCur = p;

        while(pCur != null)
        {
            Node pNex = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = pNex;
        }
        return  dummy.next;
    }

    public static void main(String[] args)
    {
        Node node5 = new Node(1,null);
        Node node4 = new Node(3,node5);
        Node node3 = new Node(3,node4);
        Node node2 = new Node(2,node3);
        Node node1 = new Node(1,node2);
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        /**
        System.out.println("before reverse");
        singlyLinkedList.printAll(node1);
        Node reverseNode = singlyLinkedList.reverseLinkList(node1);
        System.out.println();
        System.out.println("after reverse");
        singlyLinkedList.printAll(reverseNode);
        **/

        /**
        System.out.println();
        System.out.println("--------reverse with head------------");
        Node reverseNodeWithHead = singlyLinkedList.reverseLinkWithHead(node1);
        singlyLinkedList.printAll(reverseNodeWithHead);
         **/
        System.out.println(singlyLinkedList.palindrome(node1));
    }

    public void printAll(Node node)
    {
        while (node != null)
        {
            System.out.print(node.getData()+"->");
            node = node.next;
        }
        System.out.print("null");
    }

    public static class Node
    {
        private int data;
        private Node next;

        public Node (int data, Node next)
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
