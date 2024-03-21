package com.mode.design.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public String read(String fileNameSrc){
        System.out.println("读取文件，获取明文：");

        FileInputStream fileInputStream = null;
        StringBuilder sb = new StringBuilder();
        try {
            fileInputStream = new FileInputStream(fileNameSrc);
            int data;
            while((data = fileInputStream.read()) != -1) {
                sb = sb.append((char)data);
            }
            fileInputStream.close();
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
