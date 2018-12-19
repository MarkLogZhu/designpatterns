package com.marklogzhu.designpatterns.behavior.iteration;

/**
 * 电影
 */
public class FilmIterator implements Iterator {

    private String[] filmItems;
    private int position = 0;

    public FilmIterator(String[] filmItems){
        this.filmItems = filmItems;
    }

    @Override
    public boolean hasNext() {
        if(position > filmItems.length-1 || filmItems[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        String film = filmItems[position];
        position ++;
        return film;
    }

}
