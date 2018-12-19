package com.marklogzhu.designpatterns.behavior.memorandum;

/**
 * 备忘录
 */
public class Memento {
    /**
     * 血量
     */
    private int bloodFlow;
    /**
     * 魔力值
     */
    private int magicPoint;

    public int getBloodFlow() {
        return bloodFlow;
    }

    public void setBloodFlow(int bloodFlow) {
        this.bloodFlow = bloodFlow;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public Memento(int bloodFlow,int magicPoint){
        this.bloodFlow = bloodFlow;
        this.magicPoint = magicPoint;
    }
}
