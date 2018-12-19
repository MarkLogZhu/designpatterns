package com.marklogzhu.designpatterns.behavior.command;

/**
 * 遥控器调频按钮
 */
public class ChangeChannelCommand implements Command {
    private Television tv;

    public ChangeChannelCommand() {
        tv = new Television();
    }
    @Override
    public void execute() {
        tv.changeChannel();
    }
}
