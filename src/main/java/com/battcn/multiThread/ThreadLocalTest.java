package com.battcn.multiThread;

/**
 * @className:ThreadLocalTest
 * @desc:threadLocal线程安全测试，线程安全的原因是每个线程都有自己的threadLocal
 * @author:zzb
 * @date:2020/10/1822:20 version:1.0
 **/
public class ThreadLocalTest {
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        for (int i=0;i<=10;i++) {
            new Thread(()->{threadLocal.set("hahaha");
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName()+"threadLocal:get()="+threadLocal.get()+"111");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(()->{
                try {
                    Thread.sleep(999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"threadLocal:get()="+threadLocal.get());
            }).start();
        }
    }
}
