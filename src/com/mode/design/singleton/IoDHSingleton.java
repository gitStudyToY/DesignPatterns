package com.mode.design.singleton;

/**
 * Initialization	Demand	Holder	(IoDH)的技术
 */
public class IoDHSingleton {

    private IoDHSingleton(){}
    private static  class HolderClass{
        private final static IoDHSingleton instance = new IoDHSingleton();
    }
    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1,s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }

}
