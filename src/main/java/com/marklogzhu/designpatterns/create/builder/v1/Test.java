package com.marklogzhu.designpatterns.create.builder.v1;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Computer computer = director.buyComputer(new ConcreteBuilder());
        System.out.println(computer.toString());
    }
}
