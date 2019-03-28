/*
 *
 *  * 文 件 名:  Test.java
 *  * :  
 *  * 描    述:  <描述>
 *  * 版    本： 1.0.0
 *  * 创 建 人:  wangzhao
 *  * 创建时间:  18-9-20 下午4:07
 *
 */

package com.example.serial;

import java.io.*;

/**
 * 序列化保存的是对象的状态，静态变量属于类的状态，因此 序列化并不保存静态变量。
 *
 * @author wangzhao
 * @version [版本号, 2018/9/20]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test implements Serializable
{
    private static final long serialVersionUID = 1L;

    public static int staticVar = 5;

    public static void main(String[] args) {
        try {
            //初始时staticVar为5
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("/tmp/result.obj"));
            out.writeObject(new Test());
            out.close();

            //序列化后修改为10
            Test.staticVar = 10;

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                "/tmp/result.obj"));
            Test t = (Test) oin.readObject();
            oin.close();

            //再读取，通过t.staticVar打印新的值
            System.out.println(t.staticVar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
