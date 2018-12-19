package com.marklogzhu.designpatterns.behavior.intermediary;

public class Test {

    public static void main(String[] args) {
        //一个房东、一个租客、一个中介
        MediatorStructure mediator = new MediatorStructure();

        //房东和租客只需要知道中介即可
        HouseOwner houseOwner = new HouseOwner("张老三", mediator);
        Tenant tenant = new Tenant("李小四", mediator);

        //中介要知道房东和租客
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.constact("听说你那里有三室的房子出租.....");
        houseOwner.constact("是的!请问你需要租吗?");
    }
}
