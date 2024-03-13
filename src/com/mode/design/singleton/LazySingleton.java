package com.mode.design.singleton;

/**
 * 懒汉式单例模式
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if(instance == null) {
                    //创建单例实例
                    instance = new LazySingleton();
                }
            }
        }
        return  instance;
    }

    public static void main(String[] args) {
        LazySingleton s1,s2;
        s1 = LazySingleton.getInstance();
        s2 = LazySingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
