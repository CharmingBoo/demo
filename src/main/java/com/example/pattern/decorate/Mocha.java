/*
 *
 *  * 文 件 名:  Mocha.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-12 下午5:01
 *
 */

package com.example.pattern.decorate;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1 + beverage.cost();
    }
}
