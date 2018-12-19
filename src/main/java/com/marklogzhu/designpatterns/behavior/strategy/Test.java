package com.marklogzhu.designpatterns.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        SortHandler ah = new SortHandler();
        // 冒泡排序
        ah.setSortObj(new BubbleSort());
        outPrint(ah.sort(arr));
        // 选择排序
        ah.setSortObj(new SelectionSort());
        outPrint(ah.sort(arr));
    }

    private static void outPrint(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.println();
    }


}
