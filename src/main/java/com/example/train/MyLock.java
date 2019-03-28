/*
 *
 *  * 文 件 名:  MyLock.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-14 上午10:51
 *
 */

package com.example.train;

/**
 * 非可重入锁
 * @author wangzhao
 * @version [版本号, 2018/9/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class MyLock
{
    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException
    {
        while (isLocked)
        {
            wait();
        }
        isLocked = true;
    }

    public synchronized void unlock()
    {
        isLocked = false;
        notify();
    }

    public static void main(String[] args)
    {
        MyLock myLock = new MyLock();

        try
        {
            myLock.lock();
            //....
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            myLock.unlock();
        }
    }

}
