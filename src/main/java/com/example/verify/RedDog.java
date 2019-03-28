/*
 *
 *  * 文 件 名:  RedDog.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-30 上午11:15
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
public class RedDog extends Dog
{
    private int x = 1;
    private static int y= 2;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public static int getY()
    {
        return y;
    }

    public static void setY(int y)
    {
        RedDog.y = y;
    }

    static
    {
        System.out.println("123");
    }

    public static void main(String[] args)
    {
        RedDog r1 = new RedDog();
        int x = r1.x;
        int y = RedDog.y;
        System.out.println(x+"---"+y);

        RedDog r2 = new RedDog();
        int x2 = r2.x;
        int y2 = RedDog.y;
        System.out.println(x2+"---"+y2);

        r1.setX(11);
        System.out.println(r1.x);
        System.out.println(r2.x);


    }
}
