package com.designPattern.simpleFactory;

/**
 * @className:MainClass
 * @desc: 简单工厂模式属于类的创建型模式, 又叫做静态
 * 工厂方法模式。通过专门定义一个类来负责创建
 * 其他类的实例，被创建的实例通常都具有共同的
 * 父类。
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
