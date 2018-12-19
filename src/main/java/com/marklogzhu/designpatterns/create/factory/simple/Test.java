package com.marklogzhu.designpatterns.create.factory.simple;

public class Test {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.getCourse(CourseFactory.COURSE_JAVA);
        course.learn();
    }
}
