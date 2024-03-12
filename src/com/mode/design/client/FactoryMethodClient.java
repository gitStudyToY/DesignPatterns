package com.mode.design.client;

import com.mode.design.factorymethod.PictureFactory;
import com.mode.design.factorymethod.PictureReader;
import com.mode.design.util.XMLUtil;

public class FactoryMethodClient {

    public static void main(String[] args) {
        PictureReader pictureReader;
        PictureFactory type = (PictureFactory) XMLUtil.getPictureType();
//        pictureReader = type.createPicture();
//        pictureReader.read();
        type.read();
    }
}
