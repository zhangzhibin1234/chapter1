package com.designPattern.singleton.hungry;

/**
 * @className:Hungry
 * @desc:饿汉式
 * @author:zzb
 * @date:2020/6/16:15 version:1.0
 **/
public class Hungry {
    private Hungry() {}
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}
