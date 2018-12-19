package com.marklogzhu.designpatterns.create.single.v2;

public class Singleton {

    private static Singleton singleton;

    static{
        singleton = new Singleton();
    }


    /**
     * 私有化构造器
     */
    private Singleton(){
    }

    /**
     * 获取对象
     * @return
     */
    public static Singleton getInstance(){
        return singleton;
    }

}
