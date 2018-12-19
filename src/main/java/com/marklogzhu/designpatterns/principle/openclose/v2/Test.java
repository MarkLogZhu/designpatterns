package com.marklogzhu.designpatterns.principle.openclose.v2;

public class Test {

    public static void main(String[] args) {
        Calculation obj = new Addition();
        obj.calculation();
        obj = new Subtraction();
        obj.calculation();
    }
}
