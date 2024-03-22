package com.mode.design.proxy;

import java.time.LocalTime;
import java.util.Locale;

public class Proxy implements Subject{
    RealSubject realSubject = new RealSubject();

    private void preRequest(){
        System.out.println("方法operation()被调用，调用时间为" + LocalTime.now());
    }
    @Override
    public void operation() {
        preRequest();
        try {
            realSubject.operation();
            success();
        }catch (Exception e) {
            fail();
        }

    }

    private void success(){
        System.out.println("方法调用成功");
    }

    private void fail(){
        System.out.println("方法调用失败");
    }
}
