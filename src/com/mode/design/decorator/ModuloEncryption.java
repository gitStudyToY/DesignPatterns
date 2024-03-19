package com.mode.design.decorator;

public class ModuloEncryption extends EncryptionDecorator {
    public ModuloEncryption(EncryptionAlgorithm encryptionAlgorithm) {
        super(encryptionAlgorithm);
        System.out.println("三次加密");
    }
    public void encrypt3(){
        System.out.println("求模加密");
    }
    @Override
    public void encrypt(){
        super.encrypt();
        encrypt3();
    }
}
