package com.mode.design.bridge;

public class DB2Database implements Database {
    @Override
    public void read() {
        System.out.println("通过DB2读取数据");
    }
}
