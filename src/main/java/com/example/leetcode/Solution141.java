/*
 *
 *  * 文 件 名:  Solution141.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-22 下午5:42
 *
 */

package com.example.leetcode;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/10/22]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Solution141
{
    public static void main(String[] args)
    {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        System.out.println(node1);
    }
}
