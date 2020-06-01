package com.designPattern.singleton.lazy;

/**
 * @className:LazyOne
 * @desc: 懒汉式,现成不安全
 * @author:zzb
 * @date:2020/6/16:34 version:1.0
 **/
public class LazyOne {
    private LazyOne(){};
    private static LazyOne lazyOne =null;
    public static LazyOne getInstance(){
        if (null==lazyOne){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
