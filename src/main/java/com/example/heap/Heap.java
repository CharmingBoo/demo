package com.example.heap;

/**
 * 堆
 * @author wangzhao
 * @version [版本号, 2019/3/25]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Heap
{
    private int[] a; //数组，从下标1开始存储数据
    private int n; //堆中可以存储的最大数据个数
    private int count; //堆中已存储的数据个数

    public Heap(int capacity)
    {
        a = new int[capacity+1];
        n = capacity;
        count = 0;
    }

    /**
     * 堆中插入一个元素
     * @param data
     */
    public void insert(int data)
    {
        if(count>=n)
        {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        //自下往上堆化
        while(i/2>0 && a[i]>a[i/2])
        {
            swap(a,i,i/2);
            i = i/2;
        }
    }

    private void swap(int[] a, int x, int y)
    {
        int temp = a[x];
        a[x]= a[y];
        a[y]= a[temp];
    }

    public void removeMax()
    {
        if(count == 0)
        {
            return;
        }
        a[1]= a[count];
        count--;
        heapify(a,count,1);
    }

    /**
     * 自上向下堆化
     * @param a
     * @param n
     * @param i
     */
    private void heapify(int[] a, int n, int i)
    {
        while (true)
        {
            int maxPos = i;
            if(i*2<=n && a[i]<a[i*2])
            {
                maxPos = i*2;
            }
            if(i*2+1<n && a[maxPos]<a[i*2 +1])
            {
                maxPos = i*2+1;
            }
            if(maxPos==i)
            {
                break;
            }
            swap(a,i,maxPos);
            i = maxPos;
        }
    }

}
