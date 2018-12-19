package com.marklogzhu.designpatterns.principle.openclose.v1;


public class Addition {

    public void calculation(int type) {
        switch (type) {
            case 1:
                System.out.println("加法计算");
                break;
            case 2:
                System.out.println("减法法计算");
                break;
        }
    }
}
