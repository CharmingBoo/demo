/*
 *
 *  * 文 件 名:  Calculator.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-5 下午6:00
 *
 */

package com.example.thread;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/9/5]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Calculator
{
    private ImmutableValue currentValue = null;

    public ImmutableValue getValue(){
        return currentValue;
    }

    public void setValue(ImmutableValue newValue){
        this.currentValue = newValue;
    }

    public void add(int newValue){
        this.currentValue = this.currentValue.add(newValue);
    }
}
