package com.marklogzhu.designpatterns.create.single.v3;

public class Singleton {

    private static Singleton singleton;

    /**
     * 私有化构造器
     */
    private Singleton() {
    }

    /**
     * 获取对象
     *
     * @return
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
