/*
 *
 *  * 文 件 名:  DarkRoast.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-12 下午4:51
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
public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
