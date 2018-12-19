package com.marklogzhu.designpatterns.create.factory.method;

public class MysqlCourse implements ICourse {
    @Override
    public void learn() {
        System.out.println("正在学习 Mysql ......");
    }

}
