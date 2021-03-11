package com.designPattern.adapter;

/**
 * @className:Adapter2
 * @desc: 委托实现适配器
 * @author:zzb
 * @date:2021/3/1121:20 version:1.0
 **/
public class Adapter2 {
    private Current current;
    public Adapter2(Current current){
        this.current=current;
    }
    public void user20V(){
        System.out.println("使用适配器");
        current.use220v();
    }
}
