package com.marklogzhu.designpatterns.behavior.responsibility;

/**
 * 辅导员
 */
public class Instructor extends Leader {
    public Instructor(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveForm LeaveNode) {
        //小于3天辅导员审批,否则传递给系主任
        if (LeaveNode.getNumber() <= 3) {
            System.out.println("辅导员" + name + "审批" + LeaveNode.getPerson()
                    + "同学的请假条,请假天数为"
                    + LeaveNode.getNumber() + "天。");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
}
