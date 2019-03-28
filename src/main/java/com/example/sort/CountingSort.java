/*
 *
 *  * 文 件 名:  CountingSort.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-3-6 下午3:23
 *
 */

package com.example.sort;

import java.util.Collection;
import java.util.Collections;

/**
 * 计数排序
 * @author wangzhao
 * @version [版本号, 2019/3/6]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class CountingSort
{
    // 计数排序，a是数组，n是数组大小。假设数组中存储的都是非负整数。
    public static void countingSort(int[] a, int n)
    {
        if (n <= 1)
            return;

        //查找数组中数据的范围
        int max = a[0];
        for (int i = 1; i < n; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }

        int[] c = new int[max + 1];// 申请一个计数数组 c，下标大小 [0,max]

        // 计算每个元素的个数，放入c中
        for (int i = 0; i < n; i++)
        {
            c[a[i]]++;
        }

        //依次累加
        for (int i = 1; i < max+1; i++)
        {
            c[i] = c[i - 1] + c[i];
        }

        // 计算排序的关键步骤
        int[] r = new int[n];
        for (int i = n - 1; i >= 0; i--)
        {
            int index = c[a[i]] - 1;
            r[index] = a[i];
            c[a[i]]--;
        }

        // 将结果拷贝会a数组
        for (int i = 0; i < n; i++)
        {
            a[i] = r[i];
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{4,5,6,3,2,1};
        countingSort(a,6);
        for(int i =0;i<6 ;i++)
        {
            System.out.println(a[i]);
        }
    }
}
