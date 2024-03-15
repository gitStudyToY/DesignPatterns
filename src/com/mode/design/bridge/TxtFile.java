package com.mode.design.bridge;

public class TxtFile extends AbstractFile {
    @Override
    public void trans() {
        database.read();
        System.out.println("转换为TXT文件");
    }
}
