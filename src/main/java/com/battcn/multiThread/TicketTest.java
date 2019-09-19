package com.battcn.multiThread;

/**
 * @className:TicketTest
 * @desc:
 * @author:zzb
 * @date:2019/7/122:42 version:1.0
 **/
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3= new Thread(ticket,"窗口3");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
