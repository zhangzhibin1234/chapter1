package com.battcn.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @className:ExcutorsTest
 * @desc:
 * @author:zzb
 * @date:2019/6/3022:42 version:1.0
 **/
public class ExcutorsTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        MyRunnable r=new MyRunnable();
        //从线程池获取一个线程
        executorService.submit(r);
        //从线程池获取另外一个线程
        executorService.submit(r);
        executorService.isShutdown();
    }
}
