/*
 *
 *  * 文 件 名:  CollectionDemo.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-5 下午1:34
 *
 */

package com.example.container;

import java.util.*;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/5]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class CollectionDemo
{
    public static void main(String[] args)
    {
        CollectionDemo demo  = new CollectionDemo();
        demo.tLinkedList();
    }

    public void tArrayList()
    {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("1");
        List<String> stringList2 = new ArrayList<>(20);
        stringList2.add("2");
    }

    public void tVector()
    {
        //vector线程安全，速度慢  替代方案
        List<String> list =  new ArrayList<>();
        List<String> synList = Collections.synchronizedList(list);
    }

    public void tLinkedList()
    {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("a");
        System.out.println(stringLinkedList.getFirst());
    }

    public void tHashMap()
    {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(null,null);
        hashMap.put("q","1");
        System.out.println(hashMap);
    }
}
