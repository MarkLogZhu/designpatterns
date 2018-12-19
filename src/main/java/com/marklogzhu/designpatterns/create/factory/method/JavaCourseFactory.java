package com.marklogzhu.designpatterns.create.factory.method;



public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }

    @Override
    public INote getNote() {
        return new JavaNote();
    }
}
