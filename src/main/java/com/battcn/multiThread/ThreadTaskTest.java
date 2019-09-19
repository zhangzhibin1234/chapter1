package com.battcn.multiThread;

/**
 * @className:ThreadTaskTest
 * @desc:
 * @author:zzb
 * @date:2019/7/221:34 version:1.0
 **/
public class ThreadTaskTest {
    public static void main(String[] args) {
        Runnable task =new ThreadTask();
        Thread thread1 = new Thread(task);
        Thread thread2 =new Thread(task);
        thread1.start();
        thread2.start();
    }
}
