/*
 *
 *  * 文 件 名:  Test.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-14 下午5:23
 *
 */

package com.example;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test
{
    public static void main(String[] args)
    {
        Test test = new Test();
        Long score = 0L;
        test.getScore(score);
        System.out.println(score);
    }

    public static void printOut(int n)
    {
        if(n>=10)
        {
            printOut(n/10);
        }
        System.out.print(n%10);
    }

    public void getScore(Long score)
    {
        for(int i=0;i<10;i++)
        {
            if(i<5)
            {
                System.out.println(i);
                break;
            }

            System.out.println("out"+i);
        }
    }
}
