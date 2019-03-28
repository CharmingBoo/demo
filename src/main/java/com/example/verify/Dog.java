/*
 *
 *  * 文 件 名:  Dog.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-10-29 下午1:52
 *
 */

package com.example.verify;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/10/29]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Dog
{
        String name;

        Dog(String name) {
            this.name = name;
        }

        String getName() {
            return this.name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getObjectAddress() {
            return super.toString();
        }

        Dog()
        {

        }

        private void getDogName()
        {

        }
}
