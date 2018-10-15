package com.example.leetcode;


/**
 * Swap Nodes in Pairs
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * 说明:
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * @author wangzhao
 * @version [版本号, 2018/10/15]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Solution24
{
    /**
     * 递归 Recursion
     * ListNode tmp = head.next;
     * become : 2 -> 3 -> 4
     * head.next = tmp.next;
     * become : 1 -> 3 -> 4
     * tmp.next = head;
     * become : 2 -> 1 -> 3 -> 4
     * @param head
     * @return
     */
    public static ListNode swapPairs(ListNode head)
    {
       if(head == null || head.next == null)
       {
           return head;
       }

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode node = swapPairs(node1);
        System.out.println(node.toString());
    }

}
