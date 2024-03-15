package com.mode.design.bridge;

public class MysqlDataBase implements Database {
    @Override
    public void read() {
        System.out.println("通过Mysql读取数据");
    }
}
