package com.marklogzhu.designpatterns.create.single.v5;

public enum Singleton {
    INSTANCE {

        @Override
        protected void read() {
            System.out.println("read");
        }

        @Override
        protected void write() {
            System.out.println("write");
        }

    };
    protected abstract void read();
    protected abstract void write();
}
