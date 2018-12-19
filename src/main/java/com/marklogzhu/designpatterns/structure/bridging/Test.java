package com.marklogzhu.designpatterns.structure.bridging;

public class Test {
    public static void main(String[] args) {
        IMessageImplementor messageSMS = new MessageSMS();
        IMessageImplementor messageEmail = new MessageEmail();
        // 普通消息 + 邮件发送
        AbstractMessage commonMessage1 = new CommonMessage(messageEmail);
        commonMessage1.sendMessage("MarkLogZhu","test");

        // 普通消息 + 短信发送
        AbstractMessage commonMessage2 = new CommonMessage(messageSMS);
        commonMessage2.sendMessage("MarkLogZhu","test");

        // 紧急消息 + 邮件发送
        AbstractMessage urgentMessage1 = new UrgentMessage(messageEmail);
        urgentMessage1.sendMessage("MarkLogZhu","test");

        // 紧急消息 + 短信发送
        AbstractMessage urgentMessage2 = new UrgentMessage(messageSMS);
        urgentMessage2.sendMessage("MarkLogZhu","test");
    }
}
