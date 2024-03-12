package com.mode.design.simplefactory;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void display() {
        System.out.println("展示三角形");
    }
}
