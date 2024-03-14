package com.mode.design.client;

import com.mode.design.abstractfactory.InterfaceController;
import com.mode.design.abstractfactory.OperationController;
import com.mode.design.abstractfactory.SystemFactory;
import com.mode.design.builder.AbstractMode;
import com.mode.design.builder.Director;
import com.mode.design.builder.Element;
import com.mode.design.util.XMLUtil;

/**
 * @author Administrator
 */
public class BuilderClient {
    public static void main(String[] args) {
        AbstractMode type = (AbstractMode) XMLUtil.getBuilder();
        Director director = new Director();
        Element element = director.construct(type);
        System.out.println(element.getControlBar());
        System.out.println(element.getFavortiesList());
        System.out.println(element.getMainWindow());
        System.out.println(element.getMenu());
        System.out.println(element.getPlaylist());
    }
}
