/*
 *
 *  * 文 件 名:  OuterClass.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-30 下午1:54
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
public class OuterClass
{
    public int x = 1;

    public static  int y = 2;

    class InnerClass
    {
        int ix = x;
        int iy = y;
    }

    static class StaticInnerClass
    {
        //int sx = x;
        int sy = y;
    }

    public static void main(String[] args)
    {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        StaticInnerClass staticInnerClass = new StaticInnerClass();
    }
}
