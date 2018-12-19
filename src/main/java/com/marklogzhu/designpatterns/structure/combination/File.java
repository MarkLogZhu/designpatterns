package com.marklogzhu.designpatterns.structure.combination;

public abstract class File {

    public File(String name){
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
