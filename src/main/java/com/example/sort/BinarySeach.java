/*
 *
 *  * 文 件 名:  BinarySeach.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-3-7 下午4:37
 *
 */

package com.example.sort;

/**
 * 二分查找
 * @author wangzhao
 * @version [版本号, 2019/3/7]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class BinarySeach
{
    /**
     * 循环实现
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int binarySeach(int[] a, int n, int value)
    {
        int low = 0;
        int high = n - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (a[mid] == value)
            {
                return mid;
            }
            else if (a[mid] < value)
            {
                low = mid + 1;
            }
            else if (a[mid] > value)
            {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySeach2(int[] a, int n, int value)
    {
        return binarySeachInternally(a, 0, n - 1, value);
    }

    private static int binarySeachInternally(int[] a, int low, int high, int value)
    {
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;
        if (a[mid] == value)
        {
            return mid;
        }
        else if (a[mid] < value)
        {
            return binarySeachInternally(a, mid + 1, high, value);
        }
        else
        {
            return binarySeachInternally(a, low, mid - 1, value);
        }
    }

    /**
     * 变体一：查找第一个值等于给定值的元素
     * @param a
     * @param n
     * @param value
     */
    public static int binarySearch2(int[] a, int n, int value)
    {
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(a[mid]>value)
            {
                high = mid -1;
            }
            else if(a[mid]<value)
            {
                low = mid+1;
            }
            else
            {
               if((mid == 0)||a[mid-1]!=value)
               {
                   return mid;
               }
               else
               {
                   high = mid -1;
               }
            }
        }
        return -1;
    }

    /**
     * 变体二：查找最后一个值等于给定值的元素
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int binarySeach3(int[] a, int n, int value)
    {
        int low = 0;
        int high = n-1;

        while (low<=high)
        {
            int mid = low + (high-low)/2;
            if(a[mid]>value)
            {
                high = mid -1;
            }
            else if(a[mid]<value)
            {
                low = mid +1;
            }
            else
            {
                if(mid == (n-1)|| a[mid+1]!=value)
                {
                    return mid;
                }
                else
                {
                    low = mid +1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找第一个大于等于给定值元素
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int binarySeach4(int[] a, int n, int value)
    {
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low + (high - low)/2;
            if(a[mid]<value)
            {
                low = mid +1;
            }
            else
            {
                if(mid == 0 ||a[mid-1]<value)
                {
                    return mid;
                }
                else
                {
                    high = mid -1;
                }
            }
        }
        return -1;
    }

    /**
     * 查找最后一个小于等于给定值的元素
     * @param a
     * @param n
     * @param value
     * @return
     */
    public static int binarySeach5(int[] a, int n,int value)
    {
        int low = 0;
        int high = n-1;
        while (low<=high)
        {
            int mid = low + (high-low)/2;
            if(a[mid]>value)
            {
                high = mid -1;
            }
            else
            {
                if(mid == (n-1) || a[mid+1]>value)
                {
                    return mid;
                }
                else
                {
                    low = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{1,2,3,4,4,4,5,5,7};
        System.out.println(binarySeach5(a,9,4));
    }
}
