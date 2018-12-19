package com.marklogzhu.designpatterns.behavior.intermediary;

/**
 * 租客
 */
public class Tenant extends Person{

    Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * @desc 与中介者联系
     * @param message
     * @return void
     */
    public void constact(String message){
        mediator.constact(message, this);
    }

    /**
     * @desc 获取信息
     * @param message
     * @return void
     */
    public void getMessage(String message){
        System.out.println("租客:" + name +",获得信息：" + message);
    }
}
