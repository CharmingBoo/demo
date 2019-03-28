/*
 *
 *  * 文 件 名:  Counter.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-5 下午4:44
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
public class Counter {
    protected long count = 0;
    public void add(long value){
        this.count = this.count + value;
    }

    public void someMethod()
    {
        long threadSafeInt = 0;
        threadSafeInt++;
    }

    public void someMethod1()
    {
        LocalObject localObject = new LocalObject();

        localObject.callMethod();
        method2(localObject);
    }

    public void method2(LocalObject localObject)
    {
        localObject.setValue("value");
    }
}
