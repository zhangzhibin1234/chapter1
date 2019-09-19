package com.designPattern.simpleFactory;

/**
 * @className:MainClass
 * @desc:
 * @author:zzb
 * @date:2019/8/2722:11 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Fruit apple =FruitFactory.getFruit("com.designPattern.simpleFactory.Apple");
        apple.get();
        Fruit banana = FruitFactory.getFruit("com.designPattern.simpleFactory.Banana");
        banana.get();
    }
}
