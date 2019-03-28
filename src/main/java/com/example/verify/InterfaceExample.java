/*
 *
 *  * 文 件 名:  InterfaceExample.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-29 下午3:54
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
public interface InterfaceExample
{
    void func1();
    default void func2()
    {
        System.out.println("func2");
    }
    int x = 123;
    // int y;               // Variable 'y' might not have been initialized
    public int z = 0;// Modifier 'public' is redundant for interface fields
    //private int i = 0;// Modifier 'private' not allowed here/ Modifier 'protected' not allowed here
}
