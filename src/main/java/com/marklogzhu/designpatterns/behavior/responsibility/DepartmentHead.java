package com.marklogzhu.designpatterns.behavior.responsibility;

/**
 * 系主任
 */
public class DepartmentHead extends Leader {
    public DepartmentHead(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveForm LeaveNode) {
        //小于7天系主任审批,否则传递给院长
        if (LeaveNode.getNumber() <= 7) {
            System.out.println("系主任" + name + "审批" + LeaveNode.getPerson()
                    + "同学的请假条,请假天数为" + LeaveNode.getNumber() + "天。");
        } else {
            if (this.successor != null) {
                this.successor.handleRequest(LeaveNode);
            }
        }
    }
}
