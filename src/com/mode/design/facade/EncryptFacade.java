package com.mode.design.facade;

public class EncryptFacade {

    private FileReader fileReader;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;
    public EncryptFacade(){
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        cipherMachine = new CipherMachine();
    }
    //调用其他对象的方法
    public void fileEncrypt(String fileNameSrc,String fileNameDes) {
        String plainStr = fileReader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr,fileNameDes);
    }
}
