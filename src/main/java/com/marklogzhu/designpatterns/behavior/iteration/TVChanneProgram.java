package com.marklogzhu.designpatterns.behavior.iteration;

import java.util.ArrayList;
import java.util.List;

public class TVChanneProgram implements Program{

    private List<String> tvChanneList;

    public TVChanneProgram(){
        tvChanneList = new ArrayList<>();
        addItem("欢乐戏剧人");
        addItem("吐槽大会");
        addItem("奇葩说");
    }
    @Override
    public void addItem(String title) {
        tvChanneList.add(title);
    }

    @Override
    public Iterator createIrerator() {
        return new TVChanneIterator(tvChanneList);
    }
}
