package com.mode.design.factorymethod;

public class JPGReader implements PictureReader {
    @Override
    public void read() {
        System.out.println("JPG图片读取器读取JPG格式的图片");
    }
}
