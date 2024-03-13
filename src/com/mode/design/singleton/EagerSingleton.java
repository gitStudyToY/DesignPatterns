package com.mode.design.singleton;

/**
 * 饿汉单例模式
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton s1,s2;
        s1 = EagerSingleton.getInstance();
        s2 = EagerSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
