package com.marklogzhu.designpatterns.behavior.command;

public class Test {

    public static void main(String[] args) {
        Command openCommand, closeCommand, changeCommand;

        openCommand = new OpenTvCommand();
        closeCommand = new CloseTvCommand();
        changeCommand = new ChangeChannelCommand();

        Controller control = new Controller(openCommand, closeCommand, changeCommand);
        // 打开电视机
        control.open();
        // 换频道
        control.change();
        // 关闭电视机
        control.close();
    }
}
