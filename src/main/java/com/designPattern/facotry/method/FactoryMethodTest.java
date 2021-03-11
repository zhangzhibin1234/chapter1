package com.designPattern.facotry.method;

import com.designPattern.facotry.Milk;

/**
 * @className:FactoryMethodTest
 * @desc:
 * @author:zzb
 * @date:2020/5/615:05 version:1.0
 **/
public class FactoryMethodTest {
    public static void main(String[] args) {
        MilkFactory factory = new MenniuFactory();
        Milk menniuMilk = factory.getMilk();
        System.out.println(menniuMilk.getName());


    }
}
