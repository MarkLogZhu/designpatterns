package com.marklogzhu.designpatterns.behavior.interpreter;

public class Test {

    public static void main(String[] args) {
        String statement = "3 * 2 * 4 / 6";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
