package com.marklogzhu.designpatterns.behavior.templatemethod;

public class Coffee extends BrewingBeverage {
    @Override
    void addCondiments() {
        System.out.println("添加咖啡");
    }
}
