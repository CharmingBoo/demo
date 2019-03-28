/*
 *
 *  * 文 件 名:  LRUCache3.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-6 下午3:01
 *
 */

package com.example.container;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/6]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class LRUCache3<K,V> extends LinkedHashMap<K,V>
{
    private static final int MAX_ENTRIES = 3;

    @Override protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size()>MAX_ENTRIES;
    }

    LRUCache3()
    {
        super(MAX_ENTRIES,0.75f,true);
    }

    public static void main(String[] args)
    {
        LRUCache3<Integer,String> cache3 = new LRUCache3<>();
        cache3.put(1,"a");
        cache3.put(2,"b");
        cache3.put(3,"c");
        cache3.get(1);
        cache3.put(4,"d");

        System.out.println(cache3.keySet());
    }
}
