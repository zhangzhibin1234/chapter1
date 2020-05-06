package com.designPattern.facotry.simple;

/**
 * @className:SimpleFactoryTest
 * @desc:
 * @author:zzb
 * @date:2020/5/614:54 version:1.0
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
        System.out.println(new SimpleFactory().getMilk("蒙牛"));
    }
}
