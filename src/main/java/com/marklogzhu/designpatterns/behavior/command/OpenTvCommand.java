package com.marklogzhu.designpatterns.behavior.command;

/**
 * 遥控器开机按钮
 */
public class OpenTvCommand implements Command {
    private Television tv;

    public OpenTvCommand() {
        tv = new Television();
    }


    @Override
    public void execute() {
        tv.open();
    }
}
