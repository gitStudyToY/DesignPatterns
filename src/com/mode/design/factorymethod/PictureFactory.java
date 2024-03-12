package com.mode.design.factorymethod;

public abstract class PictureFactory {

    public abstract PictureReader createPicture();
    public void read(){
       PictureReader pictureReader = this.createPicture();
       pictureReader.read();
    }
}
