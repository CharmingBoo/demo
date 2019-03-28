/*
 *
 *  * 文 件 名:  TSerializable.java
 *  * 版    权:  Copyright 2017 咪咕互动娱乐有限公司,  All rights reserved
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-11-12 下午5:28
 *
 */

package com.example.io;

import java.io.*;

/**
 *
 * @author wangzhao
 * @version [版本号, 2018/11/12]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class TSerializable
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        A a1 = new A(123, "abc");
        String objectFile = "file/a1";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));
        objectOutputStream.writeObject(a1);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
        A a2 = (A) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(a2);
    }

    private static class A implements Serializable
    {

        private int x;
        private String y;

        A(int x, String y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "x = " + x + "  " + "y = " + y;
        }
    }
}
