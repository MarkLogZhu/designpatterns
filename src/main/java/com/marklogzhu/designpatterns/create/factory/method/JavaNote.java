package com.marklogzhu.designpatterns.create.factory.method;

public class JavaNote implements INote {
    @Override
    public void write() {
        System.out.println("写 Java 笔记");
    }

    @Override
    public void read() {
        System.out.println("读 Java 笔记");
    }
}
