package com.marklogzhu.designpatterns.behavior.strategy;

/**
 * 选择排序
 */
public class SelectionSort implements  Sort {
    @Override
    public int[] sort(int[] arr) {
        System.out.println("选择排序");
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            temp = arr[i];
            int j;
            int samllestLocation = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < temp) {
                    temp = arr[j];
                    samllestLocation = j;
                }
            }
            arr[samllestLocation] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
