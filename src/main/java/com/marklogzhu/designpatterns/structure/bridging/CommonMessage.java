package com.marklogzhu.designpatterns.structure.bridging;

public class CommonMessage extends AbstractMessage{

    public CommonMessage(IMessageImplementor implementor) {
        super(implementor);
    }
}
