package com.mode.design.flyweight;

public class Video implements FlyWeight {
    @Override
    public void display(CoordinateLocation coordinateLocation) {
        System.out.println("视频,位置为：" + coordinateLocation.getX() + "-" + coordinateLocation.getY());
    }
}
