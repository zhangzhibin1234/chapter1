package com.battcn.multiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @className:ExcutorCallable
 * @desc:
 * @author:zzb
 * @date:2019/6/3022:55 version:1.0
 **/
public class ExcutorCallable {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Callable callable = new MyCallable();
        //获取一个线程池对象并且提交线程任务
        service.submit(callable);
        service.submit(callable);
        //关闭线程池对象
        service.shutdown();
    }
}
