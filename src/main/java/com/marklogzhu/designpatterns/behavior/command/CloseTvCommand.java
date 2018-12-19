package com.marklogzhu.designpatterns.behavior.command;

/**
 * 遥控器关机按钮
 */
public class CloseTvCommand implements Command {

    private Television tv;

    public CloseTvCommand() {
        tv = new Television();
    }
    @Override
    public void execute() {
        tv.close();
    }
}
