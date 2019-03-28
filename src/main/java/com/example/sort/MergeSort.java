/*
 *
 *  * 文 件 名:  MergeSort.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-3-4 下午5:42
 *
 */

package com.example.sort;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/3/4]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class MergeSort
{
    //归并排序算法  n数组大小
    public static void mergeSort(int[] a,int n)
    {
        mergeSortInternally(a,0,n-1);
    }

    //递归调用函数
    private static void mergeSortInternally(int[] a, int p,int r)
    {
        // 递归终止条件
        if(p>=r)
        {
            return;
        }
        // 取p到r之间的中间位置q,防止（p+r）的和超过int类型最大值
        int q = p + (r-p)/2;
        mergeSortInternally(a,p,q);
        mergeSortInternally(a,q+1,r);

        merge(a,p,q,r);
    }

    private static void merge(int[] a, int p, int q, int r)
    {
        int i = p;
        int j = q+1;
        int k = 0;

        int [] temp = new int[r-p+1];

        while (i<=q && j<=r)
        {
            if(a[i]<=a[j])
            {
                temp[k]= a[i];
                k++;
                i++;
            }
            else
            {
                temp[k++]= a[j++];
            }
        }

        //判断哪个子数组有剩余数据
        int start = i;
        int end = q;
        if(j<=r)
        {
            start = j;
            end = r;
        }

        //将剩余数组拷贝至temp数组
        while (start<=end)
        {
            temp[k++] = a[start++];
        }

        for(i = 0;i<=r-p;i++)
        {
            a[p+i]= temp[i];
        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{4,5,6,3,2,1};
        mergeSort(a,6);
        for(int i =0;i<6 ;i++)
        {
            System.out.println(a[i]);
        }
    }
}
