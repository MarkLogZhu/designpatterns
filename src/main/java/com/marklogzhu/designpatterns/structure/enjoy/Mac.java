package com.marklogzhu.designpatterns.structure.enjoy;

import java.math.BigDecimal;

public class Mac implements IGoods {
    @Override
    public String getDesc() {
        return "苹果电脑";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(18888);
    }
}
