package com.designPattern.adapter;

/**
 * @className:Adapter1
 * @desc: 继承实现适配器
 * @author:zzb
 * @date:2021/3/1121:19 version:1.0
 **/
public class Adapter1 extends Current {

    public void use20v() {
        System.out.println("使用适配器");
        super.use220v();
    }
}
