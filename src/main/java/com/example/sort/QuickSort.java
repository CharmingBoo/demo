/*
 *
 *  * 文 件 名:  QuickSort.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-3-1 下午5:14
 *
 */

package com.example.sort;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/3/1]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class QuickSort
{
    //n 数组大小
    public static void quickSort(int[] a, int n)
    {
        quickSortInternally(a,0,n-1);
    }

    //快速排序递归函数，p r 为下标
    public static void quickSortInternally(int[] a ,int p, int r)
    {
        if(p>=r)
        {
            return;
        }

        int q = partition(a,p,r);//获取分区节点
        quickSortInternally(a,p,q-1);
        quickSortInternally(a,q+1,r);
    }

    public static int partition(int[] a, int p, int r)
    {
        int pivot = a[r];
        int i = p;
        for(int j = p; j<r;j++)
        {
            if(a[j]<pivot)
            {
                if(i==j)
                {
                    i++;
                }
                else
                {
                    int temp = a[i];
                    a[i]= a[j];
                    a[j]= temp;
                    i++;
                }
            }
        }

        int temp = a[i];
        a[i]= a[r];
        a[r]= temp;

        System.out.println("i=" + i);
        return i;
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{4,5,6,3,2,1};
        quickSort(a,6);
        for(int i =0;i<6 ;i++)
        {
            System.out.println(a[i]);
        }
    }
}
