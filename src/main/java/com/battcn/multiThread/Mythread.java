package com.battcn.multiThread;

/**
 * @className:Mythread
 * @desc:多线程测试类
 * @author:zzb
 * @date:2019/6/1922:43 version:1.0
 **/
public class Mythread extends Thread {
    public Mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println("正在执行"+getName()+i);
        }
    }
}
