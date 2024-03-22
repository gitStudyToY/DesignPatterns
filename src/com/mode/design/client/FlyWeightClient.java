package com.mode.design.client;

import com.mode.design.flyweight.CoordinateLocation;
import com.mode.design.flyweight.FlyWeight;
import com.mode.design.flyweight.FlyWeightFactory;

public class FlyWeightClient {
    public static void main(String[] args) {
        FlyWeight a1,a2,b1,b2,c1,c2;
        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getInstance();

        a1 = flyWeightFactory.getFlyWeight("a");
        a2 = flyWeightFactory.getFlyWeight("a");
        System.out.println(a1 == a2);
        b1 = flyWeightFactory.getFlyWeight("p");
        b2 = flyWeightFactory.getFlyWeight("p");
        System.out.println(b1 == b2);
        c1 = flyWeightFactory.getFlyWeight("v");
        c2 = flyWeightFactory.getFlyWeight("v");
        System.out.println(c1 == c2);

        a1.display(new CoordinateLocation(1,2));
        a2.display(new CoordinateLocation(2,3));
        b1.display(new CoordinateLocation(3,4));
        b2.display(new CoordinateLocation(4,5));
        c1.display(new CoordinateLocation(5,6));
        c2.display(new CoordinateLocation(6,7));


    }
}
