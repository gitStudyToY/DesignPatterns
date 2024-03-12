package com.mode.design.factorymethod;

public class GIFReader implements PictureReader {
    @Override
    public void read() {
        System.out.println("GIF图片读取器读取GIF格式的图片");
    }
}
