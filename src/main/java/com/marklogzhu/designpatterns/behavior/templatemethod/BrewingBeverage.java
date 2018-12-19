package com.marklogzhu.designpatterns.behavior.templatemethod;

public abstract class BrewingBeverage {


    /**
     * 添加咖啡/茶叶，具体逻辑由子类实现
     */
    abstract void addCondiments();

    /**
     *
     * @desc
     *   模板方法，用来控制泡茶与冲咖啡的流程
     *   申明为 final，不希望子类覆盖这个方法，防止更改流程的执行顺序
     * @return void
     */
    final void prepareRecipe(){
        boilWater();
        addCondiments();
        pourInCup();
    }

    /**
     * 烧水
     */
    void boilWater(){
        System.out.println("烧水");
    }

    /**
     * 将水倒入杯中
     */
    void pourInCup(){
        System.out.println("将水倒入杯中");
    }
}
