package com.marklogzhu.designpatterns.create.factory.simple;

public class CourseFactory {

    public static final int COURSE_JAVA = 1;
    public static final int COURSE_MYSQL = 2;

    public ICourse getCourse(int courseType) {
        switch (courseType) {
            case COURSE_JAVA:
                return new JavaCourse();
            case COURSE_MYSQL:
                return new MysqlCourse();
            default:
                return null;
        }
    }

}
