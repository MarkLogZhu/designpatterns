package com.marklogzhu.designpatterns.behavior.observer;

/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 更新操作
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
