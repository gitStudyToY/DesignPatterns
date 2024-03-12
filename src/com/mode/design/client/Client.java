package com.mode.design.client;

import com.mode.design.simplefactory.Shape;
import com.mode.design.simplefactory.ShapeFactory;
import com.mode.design.util.XMLUtil;

public class Client {

    public static void main(String[] args) {
        Shape shape;
        String type = XMLUtil.getChartType();
        shape = ShapeFactory.createShape(type);
        shape.draw();
        shape.display();
    }
}
