package com.battcn.multiThread;

import java.util.Random;

/**
 * @className:ThreadTask
 * @desc:
 * @author:zzb
 * @date:2019/7/221:24 version:1.0
 **/
public class ThreadTask implements Runnable {
    int x= 0;
    @Override
    public void run() {
        while(true){
            if(x%2==0){
                synchronized (Mylock.lockA){
                    System.out.println("if-lockA");
                    synchronized (Mylock.lockB){
                        System.out.println("if-lockB");
                        System.out.println("if大口吃肉");
                    }
                }
            }else{
                synchronized (Mylock.lockB){
                    System.out.println("else-lockB");
                    synchronized (Mylock.lockA){
                        System.out.println("else-lockA");
                        System.out.println("else大口吃肉");
                    }
                }
            }
            x++;
        }
    }
}
