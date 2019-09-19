package com.battcn.multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @className:Ticket
 * @desc:
 * @author:zzb
 * @date:2019/7/122:37 version:1.0
 **/
public class Ticket implements Runnable {
    //模拟有100张票
    int ticket = 10;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //获取锁
            lock.lock();
            if (ticket > 0) {
                try {
                    //这个地方有可能被其他线程抢夺执行权
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖票：" + ticket--);
            }
            //释放锁
            lock.unlock();

        }
    }
}
