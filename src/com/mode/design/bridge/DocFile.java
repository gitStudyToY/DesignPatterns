package com.mode.design.bridge;

public class DocFile extends AbstractFile {
    @Override
    public void trans() {
        database.read();
        System.out.println("转换为Doc文件");
    }
}
