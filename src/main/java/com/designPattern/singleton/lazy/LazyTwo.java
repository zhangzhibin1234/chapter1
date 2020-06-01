package com.designPattern.singleton.lazy;

/**
 * @className:LazyTwo
 * @desc:
 * @author:zzb
 * @date:2020/6/16:50 version:1.0
 **/
public class LazyTwo {
    private LazyTwo(){};
    private static LazyTwo lazyTwo =null;
    public synchronized static LazyTwo getInstance(){
        if (null==lazyTwo){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
