package com.marklogzhu.designpatterns.structure.combination;

public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("图像文件,文件名：" + super.getName());
    }
}
