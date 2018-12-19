package com.marklogzhu.designpatterns.principle.openclose.v1;



public class Test {

    public static void main(String[] args) {
        Addition obj = new Addition();
        // 加法运算
        obj.calculation(1);
        // 加法运算
        obj.calculation(2);
    }
}
