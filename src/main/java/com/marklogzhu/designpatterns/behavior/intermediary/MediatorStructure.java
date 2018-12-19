package com.marklogzhu.designpatterns.behavior.intermediary;

/**
 * 具体中介
 */
public class MediatorStructure extends Mediator {
    // 中介必须知道所有房东和租客的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void constact(String message, Person person) {
        //如果是房东，则租客获得信息。反之则是房东获得信息
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
