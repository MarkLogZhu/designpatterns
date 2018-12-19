package com.marklogzhu.designpatterns.structure.decoration;

import java.math.BigDecimal;

public class Sausage implements ICakeIngredients {
    private IPancake pancake;

    public Sausage(IPancake pancake){
        this.pancake = pancake;
    }


    @Override
    public String getDesc() {
        return  pancake.getDesc() +" + 香肠";
    }

    @Override
    public BigDecimal getPrice() {
        return pancake.getPrice().add(new BigDecimal(1.5));
    }
}