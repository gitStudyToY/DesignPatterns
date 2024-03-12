package com.mode.design.simplefactory;

public class Round implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void display() {
        System.out.println("展示圆形");
    }
}
