package com.mode.design.bridge;

public class PdfFile extends AbstractFile {
    @Override
    public void trans() {
        database.read();
        System.out.println("转换为Pdf文件");
    }
}
