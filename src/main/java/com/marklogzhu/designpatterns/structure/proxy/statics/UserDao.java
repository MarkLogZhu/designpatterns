package com.marklogzhu.designpatterns.structure.proxy.statics;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存用户信息");
    }
}
