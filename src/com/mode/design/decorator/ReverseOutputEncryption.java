package com.mode.design.decorator;

public class ReverseOutputEncryption extends EncryptionDecorator {
    public ReverseOutputEncryption(EncryptionAlgorithm encryptionAlgorithm) {
        super(encryptionAlgorithm);
        System.out.println("二次加密");
    }
    public void encrypt2(){
        System.out.println("逆向输出加密");
    }
    @Override
    public void encrypt(){
        super.encrypt();
        encrypt2();
    }
}
