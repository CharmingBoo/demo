/*
 *
 *  * 文 件 名:  Test.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-12 下午3:00
 *
 */

package com.example.jvm;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test
{
    static
    {
        i = 0;
        //System.out.println(i);//静态语句块只能访问到定义在它之前的类变量，定义在它之后的类变量只能赋值，不能访问
    }
    static  int i = 1;
}
