package com.marklogzhu.designpatterns.create.prototype;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setSchoolName("浙江大学");
        student.setAdmissionDate(new Date());
        System.out.println("克隆前  >"+student.toString());
        for (int i = 0; i < 10; i++) {
            Student newStudent = (Student) student.clone();
            newStudent.setStudentName("学生--" + i);
            System.out.println("克隆中  >"+newStudent.toString());
        }
        System.out.println("克隆后  >"+student.toString());

    }
}
