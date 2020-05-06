package com.designPattern.facotry.abstra;

import com.designPattern.facotry.Milk;

/**
 * @className:AbstractFactoryTest
 * @desc:
 * @author:zzb
 * @date:2020/5/615:38 version:1.0
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory factory = new MilkFactory();
        Milk Yili =factory.getYili();
        System.out.println(Yili.getName());
    }
}
