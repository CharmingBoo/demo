/*
 *
 *  * 文 件 名:  Solution234.java
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-30 下午3:43
 *
 */

package com.example.leetcode;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/30]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Solution234
{
    public boolean isPalindrome(ListNode head) {
        if(head == null)
        {
            return true;
        }
        else
        {
            if(head.next == null)
            {
                return true;
            }
            else
            {
                ListNode midNode = getMidNode(head);
                ListNode reverseNode = reverseNode(midNode);
                while(reverseNode!= null)
                {
                    if(reverseNode.val == head.val)
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
    }

    public ListNode getMidNode(ListNode head)
    {
        ListNode p = head;
        ListNode q = head;

        while(q.next != null && q.next.next != null)
        {
            p = p.next;
            q = q.next.next;
        }
        return p.next;
    }

    public ListNode reverseNode(ListNode p)
    {
        if(p == null)
        {
            return p;
        }
        else
        {
            ListNode dummy = new ListNode(-1);
            dummy.next = null;
            ListNode pCur = p;
            while(pCur != null)
            {
                ListNode pNex = pCur.next;
                pCur.next = dummy.next;
                dummy.next = pCur;
                pCur = pNex;
            }
            return dummy.next;
        }
    }

    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);
        node1.next = node2;
        node2.next = null;

        new Solution234().isPalindrome(node1);
    }

    private void case1()
    {
        ListNode node1 = new ListNode(-16557);
        ListNode node2 = new ListNode(-8725);
        ListNode node3 = new ListNode(-29125);
        ListNode node4 = new ListNode(28873);
        ListNode node5 = new ListNode(-21702);
        ListNode node6 = new ListNode(15483);
        ListNode node7 = new ListNode(-28441);
        ListNode node8 = new ListNode(-17845);
        ListNode node9 = new ListNode(-4317);
        ListNode node10 = new ListNode(-10914);

        ListNode node11 = new ListNode(-10914);
        ListNode node12 = new ListNode(-4317);
        ListNode node13 = new ListNode(-17845);
        ListNode node14 = new ListNode(-28441);
        ListNode node15 = new ListNode(15483);
        ListNode node16 = new ListNode(-21702);
        ListNode node17 = new ListNode(28873);
        ListNode node18 = new ListNode(-29125);
        ListNode node19 = new ListNode(-8725);
        ListNode node20 = new ListNode(-16557);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;
        node20.next = null;

        new Solution234().isPalindrome(node1);
    }
}
