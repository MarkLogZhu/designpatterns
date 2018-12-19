package com.marklogzhu.designpatterns.behavior.memorandum;

public class Test {

    public static void main(String[] args) {
        // 游戏开始时 血、蓝全部满值
        Role role = new Role(100, 100);
        System.out.println("----------游戏存档时----------");
        role.display();

        // 游戏存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.saveMemento());

        role.setBloodFlow(20);
        role.setMagicPoint(20);
        System.out.println("----------游戏进行中----------");
        role.display();

        // 恢复存档
        role.restoreMemento(caretaker.getMemento());
        System.out.println("----------游戏读档后----------");
        role.display();
    }
}
