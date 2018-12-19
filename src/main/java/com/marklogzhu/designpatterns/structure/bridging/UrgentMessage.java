package com.marklogzhu.designpatterns.structure.bridging;

public class UrgentMessage extends AbstractMessage{

    public UrgentMessage(IMessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String toUser, String message) {
        // 实现紧急消息自己的逻辑
        String urgentMessage = "紧急:"+message;
        super.sendMessage(toUser, urgentMessage);
    }
}
