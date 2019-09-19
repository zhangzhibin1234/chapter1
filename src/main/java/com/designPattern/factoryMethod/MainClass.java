package com.designPattern.factoryMethod;

import com.designPattern.simpleFactory.Fruit;

/**
 * @className:MainClass
 * @desc:
 * @author:zzb
 * @date:2019/9/1822:33 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        FruitFactory appleFactory =new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();
        FruitFactory bananaFactory =new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

    }
}
