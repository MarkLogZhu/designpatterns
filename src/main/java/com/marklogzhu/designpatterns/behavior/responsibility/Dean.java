package com.marklogzhu.designpatterns.behavior.responsibility;

/**
 * 院长
 */
public class Dean extends Leader {

    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveForm LeaveNode) {
        //小于10天院长审批,否则传递给校长
        if (LeaveNode.getNumber() <= 10) {
            System.out.println("院长" + name + "审批"
                    + LeaveNode.getPerson() + "同学的请假条,请假天数为"
                    + LeaveNode.getNumber() + "天。");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
}
