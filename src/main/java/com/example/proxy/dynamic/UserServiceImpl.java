package com.example.proxy.dynamic;

/**
 * Created by wangzhao on 2018/6/25.
 */
public class UserServiceImpl implements UserService
{
    @Override
    public void addUser()
    {
        System.out.println("增加一个用户");
    }

    @Override
    public void editUser()
    {
        System.out.println("编辑一个用户");
    }
}
