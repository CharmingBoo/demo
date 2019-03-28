/*
 *
 *  * 文 件 名:  BasicSort.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-2-20 下午2:08
 *
 */

package com.example.sort;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/2/20]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class BasicSort
{
    // 冒泡排序，a 表示数组，n 表示数组大小
    public void bubbleSort(int[] a, int n)
    {
        if (n <= 1)
        {
            return;
        }

        for (int i = 0; i < n; i++)
        {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
            if (flag == false)
            {
                break;
            }
        }
    }

    /**
     * 插入排序
     * @param a
     * @param n
     */
    public void insertionSort(int[] a, int n)
    {
        if (n <= 1)
        {
            return;
        }

        for (int i = 1; i < n; i++)
        {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--)
            {
                if (a[j] > value)
                {
                    a[j + 1] = a[j];
                }
                else
                {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

    /**
     * 选择排序
     * @param a
     * @param n
     *
     *
     */
    public void selectionSort(int[] a, int n)
    {
        if (n <= 1)
        {
            return;
        }

        for (int i = 0; i < n - 1; i++)
        {
            //查找最小值
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[minIndex])
                {
                    minIndex = j;
                }
            }

            //交换
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

    }


    public static void main(String[] args)
    {
        BasicSort basicSort = new BasicSort();
        int[] a = new int[]{4,5,6,3,2,1};
        basicSort.selectionSort(a,6);
        for(int i =0;i<6 ;i++)
        {
            System.out.println(a[i]);
        }
    }

}
