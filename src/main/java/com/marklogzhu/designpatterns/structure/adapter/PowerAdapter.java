package com.marklogzhu.designpatterns.structure.adapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        if (this.ac220 != null) {
            return (ac220.output220V() / 44);
        }
        return 0;
    }
}
