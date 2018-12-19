package com.marklogzhu.designpatterns.behavior.intermediary;

/**
 * 同事对象基类
 */
public class Person {

    protected String name;
    protected Mediator mediator;

    Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
