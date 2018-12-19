package com.marklogzhu.designpatterns.behavior.command;

/**
 * 命令接口，为所有的命令声明一个接口。所有的命令都应该实现它
 */
public interface Command {
    void execute();
}
