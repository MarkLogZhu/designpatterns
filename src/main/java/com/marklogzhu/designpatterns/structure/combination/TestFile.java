package com.marklogzhu.designpatterns.structure.combination;

public class TestFile extends File {
    public TestFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("文本文件,文件名：" + super.getName());
    }
}
