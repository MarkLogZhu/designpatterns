package com.marklogzhu.designpatterns.structure.decoration;

import java.math.BigDecimal;

/**
 * 山东煎饼
 */
public class ShandongPancake implements IPancake {


    @Override
    public String getDesc() {
        return "山东煎饼";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(4);
    }
}
