package com.mode.design.simplefactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void display() {
        System.out.println("展示方形");
    }
}
