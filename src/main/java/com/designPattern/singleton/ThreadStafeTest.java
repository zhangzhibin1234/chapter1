package com.designPattern.singleton;

import com.designPattern.singleton.hungry.Hungry;

import java.util.concurrent.CountDownLatch;

/**
 * @className:ThreadStafeTest
 * @desc:
 * @author:zzb
 * @date:2020/6/16:18 version:1.0
 **/
public class ThreadStafeTest {
    public static void main(String[] args) {
        int count =100;
        CountDownLatch latch = new CountDownLatch(count);
        System.out.println("haha");
        for(int i=0;i< count;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Object obj =Hungry.getInstance();
                    System.out.println(System.currentTimeMillis()+":"+obj);
                }
            }.start();
        }
    }

}
