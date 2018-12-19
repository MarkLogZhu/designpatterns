package com.marklogzhu.designpatterns.structure.decoration;

public class Test {

    public static void main(String[] args) {
        // 普通山东煎饼
        IPancake ordinaryShandongPancake = new ShandongPancake();
        System.out.println(String.format("%s ￥%s", ordinaryShandongPancake.getDesc(),
                ordinaryShandongPancake.getPrice()));

        // 加料山东煎饼
        IPancake feedingShandongPancake = new ShandongPancake();
        // 加一个鸡蛋
        feedingShandongPancake = new Egg(feedingShandongPancake);
        // 加一个香肠
        feedingShandongPancake = new Sausage(feedingShandongPancake);
        // 加一个油条
        feedingShandongPancake = new Fritters(feedingShandongPancake);
        // 再加一个鸡蛋
        feedingShandongPancake = new Egg(feedingShandongPancake);

        System.out.println(String.format("%s ￥%s", feedingShandongPancake.getDesc(),
                feedingShandongPancake.getPrice()));
    }
}
