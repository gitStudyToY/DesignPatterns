package com.mode.design.factorymethod;

public class GIFFactory extends PictureFactory {
    @Override
    public PictureReader createPicture() {
        return new GIFReader();
    }
}
