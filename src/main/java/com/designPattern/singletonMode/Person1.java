package com.designPattern.singletonMode;

/**
 * @className:Person1
 * @desc:懒汉式
 * @author:zzb
 * @date:2019/9/2620:59 version:1.0
 **/
public class Person1 {
    private Person1() {
    }
    private static Person1 person1;
    public static Person1 getPerson1(){
        if (null ==person1) {
            person1 = new Person1();
        }
        return person1;
    }
}
