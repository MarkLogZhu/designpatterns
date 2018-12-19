package com.marklogzhu.designpatterns.structure.decoration;

import java.math.BigDecimal;

public class Fritters implements ICakeIngredients {
    private IPancake pancake;

    public Fritters(IPancake pancake){
        this.pancake = pancake;
    }


    @Override
    public String getDesc() {
        return  pancake.getDesc() +" + 油条";
    }

    @Override
    public BigDecimal getPrice() {
        return pancake.getPrice().add(new BigDecimal(2));
    }
}