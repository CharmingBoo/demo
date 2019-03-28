/*
 *
 *  * 文 件 名:  InterfaceImplementExample.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-29 下午3:58
 *
 */

package com.example.verify;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/10/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class InterfaceImplementExample implements InterfaceExample
{
    @Override
    public void func1()
    {
        System.out.println("func1");
    }

    public static void main(String[] args)
    {
        InterfaceExample ie2 = new InterfaceImplementExample();
        ie2.func1();
        ie2.func2();
        System.out.println(InterfaceExample.x);
    }
}
