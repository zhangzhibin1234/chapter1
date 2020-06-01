package com.designPattern.singleton;

import com.designPattern.singleton.hungry.Hungry;
import com.designPattern.singleton.lazy.LazyOne;
import com.designPattern.singleton.lazy.LazyThree;
import com.designPattern.singleton.lazy.LazyTwo;

import java.util.HashMap;

/**
 * @className:TimeConsumingTest
 * @desc：单例耗时测试
 * @author:zzb
 * @date:2020/6/16:42 version:1.0
 **/
public class TimeConsumingTest {
    public static void main(String[] args) {
        long count = 20000000;
        long start =System.currentTimeMillis();
        for (int i=0;i<count;i++) {
            Object obj = LazyThree.getInstance();
        }
        long end =System.currentTimeMillis();
        System.out.println("总耗时："+ (end-start));
    }
}
