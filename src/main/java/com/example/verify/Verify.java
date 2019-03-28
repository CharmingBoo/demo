package com.example.verify;

/**
 *
 *<TODO>
 *<TODO>
 *
 * @Description
 * @author wangzhao
 * @version [版本号, 2018/7/4 17:01]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Verify
{
    public static void main(String[] args)
    {
        tSwitch();

        Dog dog = new Dog("A");
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        func(dog);
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        System.out.println(dog.getName());          // A
    }

    private static void func(Dog dog) {
        System.out.println(dog.getObjectAddress()); // Dog@4554617c
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress()); // Dog@74a14482
        System.out.println(dog.getName());          // B
    }

    private static void convert()
    {
        float f = 1.1f;
        short s1 = 1;
        //s1 = s1 +1;
        s1 =+ 1;
        s1++;
        s1 = (short)(s1+1);
    }

    private static void tSwitch()
    {
        //String s = "a";
        //long s = 111;
        /*switch (s)
        {
            case 111 :
                System.out.println("aaa");
                break;
            case  222 :
                System.out.println("bbb");
                break;
        }*/
    }
}
