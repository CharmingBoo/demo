/*
 *
 *  * 文 件 名:  InitialOrderTest.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-30 下午2:04
 *
 */

package com.example.verify;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/10/30]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class InitialOrderTest
{
    public static String staticField = "静态变量";

    static
    {
        System.out.println("静态语句块");
    }

    public String field = "实例变量";

    public void test()
    {
        System.out.println("普通语句块");
    }

    public InitialOrderTest() {
        System.out.println("构造函数");
    }

    public static void main(String[] args)
    {
        InitialOrderTest initialOrderTest = new InitialOrderTest();
        initialOrderTest.test();
    }
}
