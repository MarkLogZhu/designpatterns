package com.marklogzhu.designpatterns.behavior.responsibility;

/**
 * 请假单
 */
public class LeaveForm {

    /** 请假天数 **/
    private  int number;

    /** 请假人 **/
    private String person;

    public LeaveForm(String person,int number){
        this.person = person;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
