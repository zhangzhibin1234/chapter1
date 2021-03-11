package com.designPattern.adapter;

/**
 * @className:MainClass
 * @desc:Adapter模式也叫适配器模式，是构造型模式之一
 * ，通过Adapter模式可以改变已有类（或外部类）的接
 * 口形式。
 * @author:zzb
 * @date:2021/3/1121:18 version:1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        Adapter1 adapter1 =new Adapter1();
        adapter1.use20v();

        Adapter2 adapter2 =new Adapter2(new Current());
        adapter2.user20V();
    }
}
