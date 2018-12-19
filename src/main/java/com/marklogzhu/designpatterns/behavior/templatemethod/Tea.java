package com.marklogzhu.designpatterns.behavior.templatemethod;

public class Tea extends BrewingBeverage {
    @Override
    void addCondiments() {
        System.out.println("添加茶叶");
    }
}
