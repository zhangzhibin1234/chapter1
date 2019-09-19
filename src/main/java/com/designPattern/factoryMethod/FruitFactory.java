package com.designPattern.factoryMethod;

import com.designPattern.simpleFactory.Fruit;

/**
 * @author:zzb
 * @desc:工厂方法模式抽象工厂类
 * @date:22:28 2019/9/18
 **/
public interface FruitFactory {
    public Fruit getFruit();
}
