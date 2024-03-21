package com.mode.design.facade;

import sun.nio.cs.SingleByte;

import java.beans.Encoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Base64;

public class FileWriter {
    public void write(String encryptStr,String fileNameDes) {
        System.out.println("保存密文，写入文件：");
        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream(fileNameDes);
            byte[] str = encryptStr.getBytes();
            fs.write(str);
            fs.flush();
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
