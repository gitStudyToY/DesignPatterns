package com.mode.design.flyweight;

public class Animation implements FlyWeight {
    @Override
    public void display(CoordinateLocation coordinateLocation) {
        System.out.println("动画,位置为：" + coordinateLocation.getX() + "-" + coordinateLocation.getY() );
    }
}
