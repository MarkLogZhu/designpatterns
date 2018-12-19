package com.marklogzhu.designpatterns.create.factory.method;



public class MysqlCourseFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new MysqlCourse();
    }

    @Override
    public INote getNote() {
        return new MysqlNote();
    }
}
