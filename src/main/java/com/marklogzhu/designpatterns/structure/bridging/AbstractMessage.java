package com.marklogzhu.designpatterns.structure.bridging;

public abstract class AbstractMessage {

    private IMessageImplementor implementor;

    public AbstractMessage(IMessageImplementor implementor){
        this.implementor = implementor;
    }

    public void sendMessage(String toUser , String message){
        this.implementor.send(toUser,message);
    }

}
