package com.marklogzhu.designpatterns.structure.enjoy;

import java.util.HashMap;
import java.util.Map;

public class GoodsFactory {
    private static Map<String, IGoods> goodsPool = new HashMap<>();

    public static IGoods getGoods(String name) {
        if (goodsPool.containsKey(name)) {
            System.out.println("使用商品池中对象");
        }else{
            System.out.println("创建产品");
            goodsPool.put(name,new Mac());
        }
        return goodsPool.get(name);
    }

}
