package com.marklogzhu.designpatterns.structure.decoration;

import java.math.BigDecimal;


public class Egg implements ICakeIngredients {
    private IPancake pancake;

    public Egg(IPancake pancake){
        this.pancake = pancake;
    }


    @Override
    public String getDesc() {
        return  pancake.getDesc() +" + 鸡蛋";
    }

    @Override
    public BigDecimal getPrice() {
        return pancake.getPrice().add(new BigDecimal(1));
    }
}
