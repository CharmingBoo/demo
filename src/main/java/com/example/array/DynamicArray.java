/*
 *
 *  * 文 件 名:  DynamicArray.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-27 下午4:10
 *
 */

package com.example.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/27]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class DynamicArray
{
    public static void main(String[] args) {
        // 1. initialize
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;                           // v1 == null
        // 2. cast an array to a vector
        Integer[] a = {0, 1, 2, 3, 4};
        int [] b = {1,0,0,1};
        dominantIndex(b);
        Arrays.sort(b);
        System.out.println(b);
        v1 = new ArrayList<>(Arrays.asList(a));
        // 3. make a copy
        List<Integer> v2 = v1;                      // another reference to v1
        List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
        // 3. get length
        System.out.println("The size of v1 is: " + v1.size());;
        // 4. access element
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 5. iterate the vector
        System.out.print("[Version 1] The contents of v1 are:");
        for (int i = 0; i < v1.size(); ++i) {
            System.out.print(" " + v1.get(i));
        }
        System.out.println();
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 6. modify element
        v2.set(0, 5);       // modify v2 will actually modify v1
        System.out.println("The first element in v1 is: " + v1.get(0));
        v3.set(0, -1);
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 7. sort
        Collections.sort(v1);
        // 8. add new element at the end of the vector
        v1.add(-1);
        v1.add(1, 6);
        // 9. delete the last element
        v1.remove(v1.size() - 1);
    }

    /**
     * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
     * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
     * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums)
    {
        int len = nums.length;
        int sum = getSum(nums);
        if(len<3)
        {
            return -1;
        }
        else
        {
            for (int i = 0 ; i<len;i++)
            {
                int sumL = getSumLeft(nums,i);
                int sumR = getSumRight(sum,sumL,nums[i]);
                if(sumL == sumR)
                {
                    return i;
                }
            }
            return -1;
        }
    }

    private int getSumLeft(int [] nums, int index)
    {
        int sumLeft = 0;
        for (int i = 0; i< index; i++)
        {
            sumLeft = nums[i]+sumLeft;
        }
        return  sumLeft;
    }

    private int getSumRight(int sum ,int sunLeft ,int indexValue)
    {
        int sumRight = sum - sunLeft - indexValue;
        return sumRight;
    }

    private int getSum(int [] nums)
    {
        int sum = 0;
        for(int i = 0; i<nums.length;i++)
        {
            sum = nums[i] + sum;
        }
        return sum;
    }

    /**
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     * 如果是，则返回最大元素的索引，否则返回-1。
     * @param nums
     * @return
     */
    public static int dominantIndex(int[] nums) {
        int [] temps = nums.clone();
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i =0 ;i<nums.length-1; i++)
        {
            if(nums[i]*2 > max)
            {
                return -1;
            }
        }
        for(int i = 0; i<temps.length; i++)
        {
            if(temps[i]== max)
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
     * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = 0; i<len;i++)
        {
            if(digits[len-1-i] == 9)
            {
                digits[len-1-i] = 0;
                if(i == len-1)
                {
                    int [] arr = new int[len+1];
                    arr[0]= 1;
                    for(int al = 0; i<len; i++)
                    {
                        arr[al+1] = digits[al];
                    }
                    return arr;
                }
            }
            else
            {
                digits[len-1-i] = digits[len-1-i] +1;
                return digits;
            }
        }
        return null;
    }

}
