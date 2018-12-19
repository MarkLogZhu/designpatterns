package com.marklogzhu.designpatterns.create.factory.method;

public class MysqlNote implements INote {
    @Override
    public void write() {
        System.out.println("写 Mysql 笔记");
    }

    @Override
    public void read() {
        System.out.println("读 Mysql 笔记");
    }
}
