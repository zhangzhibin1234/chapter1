package com.battcn.multiThread;

import java.util.concurrent.Callable;

/**
 * @className:MyCallable
 * @desc:
 * @author:zzb
 * @date:2019/6/3022:50 version:1.0
 **/
public class MyCallable<W> implements Callable<W> {
    @Override
    public W call() throws Exception {
        System.out.println("我要一个教练");
        Thread.sleep(2000);
        System.out.println("教练来教我了："+Thread.currentThread().getName());
        System.out.println("j教练教学完我后休息了");
        return null;
    }
}
