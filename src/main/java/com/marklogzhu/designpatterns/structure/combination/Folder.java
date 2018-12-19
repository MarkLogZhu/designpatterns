package com.marklogzhu.designpatterns.structure.combination;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    private List<File> fileList = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    /**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(File file){
        fileList.add(file);
    }

    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(File file){
        fileList.remove(file);
    }
    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for(File file : fileList){
            file.display();
        }
    }

}
