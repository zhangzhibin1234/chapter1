package com.designPattern.singleton.lazy;

/**
 * @className:LazyThree
 * @desc: 懒汉式，线程安全
 * @author:zzb
 * @date:2020/6/16:53 version:1.0
 **/
public class LazyThree {
    private static boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的

    private LazyThree(){

        synchronized (LazyThree.class){
            if(initialized == false){
                initialized = true;
            }else{
                throw new RuntimeException("单例已被侵犯");
            }
        }

    }


    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyThree getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }


    //默认不加载
    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
