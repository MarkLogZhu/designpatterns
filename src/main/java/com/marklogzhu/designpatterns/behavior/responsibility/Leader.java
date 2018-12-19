package com.marklogzhu.designpatterns.behavior.responsibility;

/**
 * 抽象处理者
 */
public abstract class Leader {

    /** 姓名 **/
    public String name;

    /** 后续处理者 **/
    protected Leader successor;

    public Leader(String name){
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveForm LeaveNode);

}
