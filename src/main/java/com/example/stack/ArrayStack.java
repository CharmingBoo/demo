/*
 *
 *  * 文 件 名:  ArrayStack.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-31 上午9:45
 *
 */

package com.example.stack;

/**
 * 基于数组实现栈结构
 * @author wangzhao
 * @version [版本号, 2019/1/31]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class ArrayStack
{
    private String[] items; //数组

    private int count; //栈中元素个数

    private int n; //栈的大小

    /**
     * 初始化数组，申请一个大小为n的数组空间
     * @param n
     */
    public ArrayStack(int n)
    {
        this.items = new String[n];
        this.n = 0;
        this.count = 0;
    }

    public boolean push(String item)
    {
        //栈已满
        if (count == n)
        {
            return false;
        }
        items[count] = item;
        count++;
        return true;
    }

    public String pop()
    {
        if (count == 0)
        {
            return null;
        }
        String temp = items[count - 1];
        count--;
        return temp;
    }
}
