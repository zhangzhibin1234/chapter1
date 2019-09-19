package com.designPattern.factoryMethod;

import com.designPattern.simpleFactory.Apple;
import com.designPattern.simpleFactory.Fruit;

/**
 * @className:AppleFactory
 * @desc:
 * @author:zzb
 * @date:2019/9/1822:31 version:1.0
 **/
public class AppleFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
