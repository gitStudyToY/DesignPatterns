package com.mode.design.decorator;

/**
 * 加密算法装饰类
 * @author Administrator
 */
public class EncryptionDecorator extends EncryptionAlgorithm{
    private EncryptionAlgorithm encryptionAlgorithm;
    public EncryptionDecorator(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }
    @Override
    public void encrypt(){
        encryptionAlgorithm.encrypt();
    }
}
