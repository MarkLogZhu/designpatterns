package com.marklogzhu.designpatterns.behavior.iteration;


import java.util.List;

/**
 * 电视频道
 */
public class TVChanneIterator implements Iterator {

    private List<String> tvChanneList;
    private int position = 0;

    public TVChanneIterator(List<String> tvChanneList) {
        this.tvChanneList = tvChanneList;
    }

    @Override
    public boolean hasNext() {
        if (position > tvChanneList.size() - 1 || tvChanneList.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String film = tvChanneList.get(position);
        position++;
        return film;
    }
}
