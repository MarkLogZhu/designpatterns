package com.marklogzhu.designpatterns.structure.bridging;

public class MessageEmail implements IMessageImplementor {
    @Override
    public void send(String toUser, String message) {
        System.out.println(String.format("邮件发送至:%s内容为：%S",toUser,message));
    }
}
