package com.designPattern.simpleFactory;

/**
 * @className:FruitFactory
 * @desc:简单工厂模式
 * @author:zzb
 * @date:2019/8/2722:16 version:1.0
 **/
public class FruitFactory {
    /**
     * @author:zzb
     * @desc:获取水果
     * @date:22:18 2019/8/27
     * @param:[type]
     * @return:com.designPattern.simpleFactory.Fruit
     **/
    public static Fruit getFruit(String type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Fruit) Class.forName(type).newInstance();
    }
}
