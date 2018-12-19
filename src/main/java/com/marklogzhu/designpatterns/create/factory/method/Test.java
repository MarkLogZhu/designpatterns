package com.marklogzhu.designpatterns.create.factory.method;


public class Test {

    public static void main(String[] args) {
        ICourseFactory factory;
        // 学习 java
        factory = new JavaCourseFactory();
        ICourse javaCourse = factory.getCourse();
        javaCourse.learn();
        INote javaNote = factory.getNote();
        javaNote.read();
        // 学习 Mysql
        factory = new MysqlCourseFactory();
        ICourse mysqlCourse = factory.getCourse();
        mysqlCourse.learn();
        INote mysqlNote = factory.getNote();
        mysqlNote.read();
    }

}
