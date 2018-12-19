package com.marklogzhu.designpatterns.behavior.iteration;

public class Test {

    public static void main(String[] args) {
        TVChanneProgram tvChanneProgram = new TVChanneProgram();
        Iterator irerator1 = tvChanneProgram.createIrerator();
        System.out.println("======显示电视频道======");
        while(irerator1.hasNext()){
            System.out.println(irerator1.next());
        }
        System.out.println("======显示电影======");
        FilmProgram filmProgram = new FilmProgram();
        Iterator irerator2 = filmProgram.createIrerator();
        while(irerator2.hasNext()){
            System.out.println(irerator2.next());
        }
    }

}
