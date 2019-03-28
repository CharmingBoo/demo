/*
 *
 *  * 文 件 名:  GTest.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  19-1-14 下午5:45
 *
 */

package com.example.generic;

/**
 *
 * @author wangzhao
 * @version [版本号, 2019/1/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class GTest
{
    public static void main(String[] args)
    {

    }

    //数组类型的兼容性
    public static void test()
    {
        Person[] arr = new Employee[5];
        arr[0] = new Student();//ArrayStoreException
    }
}
