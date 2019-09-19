package com.designPattern.factoryMethod;

import com.designPattern.simpleFactory.Banana;
import com.designPattern.simpleFactory.Fruit;

/**
 * @className:BananaFactory
 * @desc:
 * @author:zzb
 * @date:2019/9/1822:32 version:1.0
 **/
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
