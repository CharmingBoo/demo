/*
 *
 *  * 文 件 名:  MyLockReent.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-14 上午10:56
 *
 */

package com.example.train;

/**
 * 可重入锁
 * @author wangzhao
 * @version [版本号, 2018/9/14]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class MyLockReent
{
    private boolean isLocked = false;

    Thread lockBy = null;

    int lockedCount = 0;

    public synchronized void lock() throws InterruptedException
    {
        Thread callingThread = Thread.currentThread();
        while (isLocked && lockBy != callingThread)
        {
            wait();
        }
        isLocked = true;
        lockedCount++;
        lockBy = callingThread;
    }

    public synchronized void unlock()
    {
        if(Thread.currentThread() == this.lockBy)
        {
            lockedCount--;
            if(lockedCount == 0)
            {
                isLocked = false;
                notify();
            }
        }

    }

    public static void main(String[] args)
    {
        MyLockReent myLock = new MyLockReent();

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
