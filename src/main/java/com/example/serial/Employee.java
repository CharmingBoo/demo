/*
 *
 *  * 文 件 名:  Employee.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-20 下午3:27
 *
 */

package com.example.serial;

import java.io.Serializable;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/9/20]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Employee implements Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
            + " " + address);
    }
}
