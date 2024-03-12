package com.mode.design.factorymethod;

public class JPGFactory extends PictureFactory {
    @Override
    public PictureReader createPicture() {
        return new JPGReader();
    }
}
