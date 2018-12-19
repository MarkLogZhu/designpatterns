package com.marklogzhu.designpatterns.behavior.interpreter;

/**
 * 除法
 */
public class DivisionNode extends SymbolNode {
    public DivisionNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() / right.interpret();
    }
}
