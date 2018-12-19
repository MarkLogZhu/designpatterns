package com.marklogzhu.designpatterns.structure.proxy.statics;

public class Test {
    public static void main(String[] args) {
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDao());
        userDaoProxy.save();
    }
}
