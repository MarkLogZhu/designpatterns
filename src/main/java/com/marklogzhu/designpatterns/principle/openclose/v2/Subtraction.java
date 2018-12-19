package com.marklogzhu.designpatterns.principle.openclose.v2;

public class Subtraction implements Calculation {
    @Override
    public void calculation() {
        System.out.println("减法运算");
    }
}
