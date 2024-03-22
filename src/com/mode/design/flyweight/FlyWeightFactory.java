package com.mode.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private static FlyWeightFactory flyWeight = new FlyWeightFactory();
    private static Map<String,FlyWeight> map;
    public FlyWeightFactory(){
        map = new HashMap<>();
        FlyWeight a,p,v;
        a = new Animation();
        map.put("a",a);
        p = new Picture();
        map.put("p",p);
        v = new Video();
        map.put("v",v);
    }
    public static FlyWeightFactory getInstance(){
        return flyWeight;
    }
    public FlyWeight getFlyWeight(String color){
        return (FlyWeight)map.get(color);
    }

}
