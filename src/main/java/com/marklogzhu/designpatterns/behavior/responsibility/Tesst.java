package com.marklogzhu.designpatterns.behavior.responsibility;

public class Tesst {
    public static void main(String[] args) {
        Leader instructor = new Instructor("冯建强");       //辅导员
        Leader departmentHead = new DepartmentHead("冯晓强");    //系主任
        Leader dean = new Dean("张妲强");      //院长
        Leader president = new President("王望望");     //校长

        instructor.setSuccessor(departmentHead);       //辅导员的后续者是系主任
        departmentHead.setSuccessor(dean);             //系主任的后续者是院长
        dean.setSuccessor(president);                  //院长的后续者是校长

        //请假3天的请假条
        LeaveForm leaveNode1 = new LeaveForm("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveForm leaveNode2 = new LeaveForm("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveForm leaveNode3 = new LeaveForm("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveForm leaveNode4 = new LeaveForm("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}
