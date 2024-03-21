package com.mode.design.client;

import com.mode.design.facade.EncryptFacade;

public class FacadeClient {

    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncrypt("D:\\study\\workspace\\DesignPatterns\\resource\\src.txt","D:\\study\\workspace\\DesignPatterns\\resource\\dest.txt");

    }
}
