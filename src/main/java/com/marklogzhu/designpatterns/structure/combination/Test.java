package com.marklogzhu.designpatterns.structure.combination;

public class Test {

    public static void main(String[] args) {
        // 组装文本目录
        Folder testFolder = new Folder("文本目录");
        testFolder.add(new TestFile("文本文件1"));
        testFolder.add(new TestFile("文本文件2"));

        // 组装图片目录
        Folder imageFolder = new Folder("图片目录");
        imageFolder.add(new ImageFile("图片文件1"));
        imageFolder.add(new ImageFile("图片文件2"));

        // 组装视频目录
        Folder videoFolder = new Folder("视频目录");
        videoFolder.add(new VideoFile("视频文件1"));
        videoFolder.add(new VideoFile("视频文件2"));

        // 组装根目录
        Folder rootFolder = new Folder("根目录");
        rootFolder.add(testFolder);
        rootFolder.add(imageFolder);
        rootFolder.add(videoFolder);

        // 浏览目录
        System.out.println("=========浏览根目录=========");
        rootFolder.display();
        System.out.println("=========浏览文本目录=========");
        testFolder.display();
        System.out.println("=========浏览图片目录=========");
        imageFolder.display();
        System.out.println("=========浏览视频目录=========");
        videoFolder.display();
    }
}
