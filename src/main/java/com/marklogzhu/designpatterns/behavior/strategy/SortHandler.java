package com.marklogzhu.designpatterns.behavior.strategy;

public class SortHandler {

    private Sort sortObj;

    public int[] sort(int arr[]) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
