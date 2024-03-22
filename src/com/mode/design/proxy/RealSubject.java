package com.mode.design.proxy;

public class RealSubject implements Subject{

    @Override
    public void operation() {
        System.out.println("正在工作......");
    }
}
