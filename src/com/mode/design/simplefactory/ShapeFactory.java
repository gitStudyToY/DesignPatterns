package com.mode.design.simplefactory;

public class ShapeFactory {

    public static Shape createShape(String type) {
        Shape shape = null;
        switch (type) {
            case "round":
                shape = new Round();
                System.out.println("初始化设置圆形");
                break;
            case "square":
                shape = new Square();
                System.out.println("初始化设置方形");
                break;
            case "triangle":
                shape = new Triangle();
                System.out.println("初始化设置三角形");
                break;
            default:
                System.out.println("UnSupportedShapeException");
                break;
        }
        return shape;
    }

}