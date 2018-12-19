package com.marklogzhu.designpatterns.create.prototype;

import java.io.Serializable;
import java.util.Date;

public class Student implements Cloneable, Serializable {

    /**
     * 学习名称
     */
    private String schoolName;

    /**
     * 学生名称
     */
    private String studentName;

    private Date admissionDate;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        // 克隆其他对象属性
        return student;
    }

    @Override
    public String toString() {
        return "学校名称：" + this.schoolName + "; 学生姓名：" + this.studentName;
    }
}
