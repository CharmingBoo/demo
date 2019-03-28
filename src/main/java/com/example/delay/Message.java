/*
 *
 *  * 文 件 名:  Message.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-18 下午7:41
 *
 */

package com.example.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/9/18]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Message implements Delayed
{
    private int id;
    private String body;//消息体
    private long excuteTime;//执行时间

    public long getExcuteTime()
    {
        return excuteTime;
    }

    public void setExcuteTime(long excuteTime)
    {
        this.excuteTime = excuteTime;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getBody()
    {
        return body;
    }

    public void setBody(String body)
    {
        this.body = body;
    }

    public Message(int id, String body,long delayTime) {
        this.id = id;
        this.body = body;
        this.excuteTime = TimeUnit.NANOSECONDS.convert(delayTime, TimeUnit.MILLISECONDS) + System.nanoTime();
    }

    @Override
    public long getDelay(TimeUnit unit)
    {
        return unit.convert(this.excuteTime - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed delayed)
    {
        Message msg = (Message)delayed;
        return Integer.valueOf(this.id) > Integer.valueOf(msg.id) ?
            1 :
            (Integer.valueOf(this.id) < Integer.valueOf(msg.id) ? -1 : 0);
    }
}
