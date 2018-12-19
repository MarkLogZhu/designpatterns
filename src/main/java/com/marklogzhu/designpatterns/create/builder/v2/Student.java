package com.marklogzhu.designpatterns.create.builder.v2;

public class Student {
    // 姓名
    private String name;
    // 性别
    private String sex;
    // 家庭住址
    private String address;
    // 电话
    private String phone;

    public Student(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.address = builder.address;
        this.phone = builder.phone;
    }
    public static class Builder {
        private String name;
        private String sex;
        private String address = "";
        private String phone = "";
        public Builder(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder("MarkLogZhu", "男")
                .address("XXXX").phone("XXXX").build();
    }



}
