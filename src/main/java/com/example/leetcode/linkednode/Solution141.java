/*
 *
 *  * 文 件 名:  Solution141.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-2-12 上午11:16
 *
 */

package com.example.leetcode.linkednode;

import com.example.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 *
 * @author wangzhao
 * @version [版本号, 2019/2/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Solution141
{
    /**
     * 方法一：哈希表
     *
     * 思路
     * 我们可以通过检查一个结点此前是否被访问过来判断链表是否为环形链表。常用的方法是使用哈希表。
     *
     * 算法
     * 我们遍历所有结点并在哈希表中存储每个结点的引用（或内存地址）。
     * 如果当前结点为空结点 null（即已检测到链表尾部的下一个结点），那么我们已经遍历完整个链表，并且该链表不是环形链表。
     * 如果当前结点的引用已经存在于哈希表中，那么返回 true（即该链表为环形链表）。
     *
     * 复杂度分析
     * 时间复杂度：O(n)， 对于含有 nn 个元素的链表，我们访问每个元素最多一次。添加一个结点到哈希表中只需要花费 O(1)O(1) 的时间。
     * 空间复杂度：O(n)， 空间取决于添加到哈希表中的元素数目，最多可以添加 nn 个元素。
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while (head != null)
        {
            if(nodeSeen.contains(head))
            {
                return true;
            }
            else
            {
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 双指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head)
    {
        if(head == null)
        {
            return false;
        }

        ListNode show = head;
        ListNode fast = head.next;

        while (fast!= null && fast.next != null)
        {
            fast = fast.next.next;
            show = show.next;

            if(fast == show)
            {
                return true;
            }
        }
        return false;
    }

}
