/*
 *
 *  * 文 件 名:  InitialOrderTestChild.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-30 下午2:09
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
public class InitialOrderTestChild extends InitialOrderTest
{
    public int x ;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public static int sx = 1111;

    static
    {
        System.out.println("子类静态语句块");
    }

    public InitialOrderTestChild()
    {
        System.out.println("子类构造函数");
        System.out.println(x);
    }

    public void testChild()
    {
        setX(11);
        System.out.println("子类普通句快");
    }

    public static void main(String[] args)
    {
        InitialOrderTestChild initialOrderTestChild = new InitialOrderTestChild();
        initialOrderTestChild.testChild();
    }
}
