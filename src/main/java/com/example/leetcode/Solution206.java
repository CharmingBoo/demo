/*
 *
 *  * 文 件 名:  Solution206.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-12 下午1:33
 *
 */

package com.example.leetcode;

/**
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。
 *
 * 反转一个单链表。示例:
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @author wangzhao
 * @version [版本号, 2018/10/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution206
{
    /**
     * 迭代
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head)
    {
        ListNode next = null;
        ListNode pre = null;

        while (head != null)
        {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        //reverseList(node1);
        reverseList2(node1);
    }
}
