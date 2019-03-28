/*
 *
 *  * 文 件 名:  ArrayAndString.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-8-27 下午4:06
 *
 */

package com.example.array;

import java.util.Arrays;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/8/27]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class ArrayAndString
{
    public static void main(String[] args)
    {
        // 1. Initialize
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3};
        // 2. Get Length
        System.out.println("The size of a1 is: " + a1.length);
        // 3. Access Element
        System.out.println("The first element is: " + a1[0]);
        // 4. Iterate all Elements
        System.out.print("[Version 1] The contents of a1 are:");
        for (int i = 0; i < a1.length; ++i)
        {
            System.out.print(" " + a1[i]);
        }
        System.out.println();
        System.out.print("[Version 2] The contents of a1 are:");
        for (int item : a1)
        {
            System.out.print(" " + item);
        }
        System.out.println();
        // 5. Modify Element
        a1[0] = 4;
        // 6. Sort
        Arrays.sort(a1);
    }

}
