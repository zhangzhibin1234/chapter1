package com.battcn.multiThread;

/**
 * @className:MyRunnable
 * @desc:
 * @author:zzb
 * @date:2019/6/1923:22 version:1.0
 **/
public class MyRunnable implements Runnable {

  /*  @Override
    public void run() {
        for (int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"正在第"+i+"次执行");
        }
    }*/

    @Override
    public void run() {
        System.out.println("我要一个教练");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("教练来了："+Thread.currentThread().getName());
        System.out.println("教练教完我后回家休息了");
    }
}
