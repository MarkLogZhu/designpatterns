package com.marklogzhu.designpatterns.structure.enjoy;

public class Test {

    public static void main(String[] args) {
        IGoods goods = GoodsFactory.getGoods("mac 2017款");
        System.out.println(String.format("产品名称： %s,产品价格：%s",goods.getDesc(),goods.getPrice()));

        goods = GoodsFactory.getGoods("mac 2017款");
        System.out.println(String.format("产品名称： %s,产品价格：%s",goods.getDesc(),goods.getPrice()));
    }
}
