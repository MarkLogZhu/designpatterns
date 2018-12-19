package com.marklogzhu.designpatterns.create.factory.simple;

public class JavaCourse implements ICourse {
    @Override
    public void learn() {
        System.out.println("正在学习 Java ......");
    }
}
