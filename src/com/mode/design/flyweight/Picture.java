package com.mode.design.flyweight;

public class Picture implements FlyWeight {
    @Override
    public void display(CoordinateLocation coordinateLocation) {
        System.out.println("图片,位置为：" + coordinateLocation.getX() + "-" + coordinateLocation.getY());
    }
}
