package com.battcn.multiThread;

/**
 * @className:ThreadTest
 * @desc:
 * @author:zzb
 * @date:2019/6/1922:47 version:1.0
 **/
public class ThreadTest {
    public static void main(String[] args) {
        /*Mythread mythread = new Mythread("myThread");
        //开启线程并且执行
        mythread.start();
        Mythread mythread1 = new Mythread("mythread哈哈");
        mythread1.start();*/
        Runnable run = new MyRunnable();
        Thread thread1= new Thread(run,"runnable1");
        Thread thread2= new Thread(run,"runnable2");
        Thread thread = new Thread(()-> System.out.println("hahaha"));
        thread1.start();
        thread2.start();
        thread.start();
        for(int i =0;i<=10;i++){
            System.out.println("main正在执行："+i);
        }
    }
}
