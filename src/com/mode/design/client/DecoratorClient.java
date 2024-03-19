package com.mode.design.client;

import com.mode.design.decorator.EncryptionAlgorithm;
import com.mode.design.decorator.EncryptionDecorator;
import com.mode.design.decorator.ModuloEncryption;
import com.mode.design.decorator.ReverseOutputEncryption;

public class DecoratorClient {
    public static void main(String[] args) {
        EncryptionAlgorithm encryptionAlgorithm = new EncryptionAlgorithm();
        EncryptionAlgorithm encryptionDecorator = new ReverseOutputEncryption(encryptionAlgorithm);
        EncryptionAlgorithm modulo = new ModuloEncryption(encryptionDecorator);
        encryptionDecorator.encrypt();
        modulo.encrypt();

    }
}
