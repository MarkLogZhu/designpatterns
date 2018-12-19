package com.marklogzhu.designpatterns.create.builder.v1;

public class Director {

    public Computer buyComputer(Builder builder){
        builder.initChassis();
        builder.assemblyMotherboard("七彩虹");
        builder.assemblyCpu("因特尔");
        builder.assemblyHardDisk("希捷");
        builder.assemblyRam("海盗船");
        return builder.getComputer();
    }
}
