package com.mode.design.prototype;

/**
 * 抽象公文接口，也可以定义为抽象类，通过clone()方法的实现，将业务方法声明为抽象方法
 * @author Administrator
 */
public interface OfficialDocument extends Cloneable {
    public OfficialDocument clone();
    public void display();
}
