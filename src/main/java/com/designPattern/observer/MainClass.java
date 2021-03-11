package com.designPattern.observer;

/**
 * @className:MainClass
 * @desc:
 * @author:zzb
 * @date:2021/2/2821:07 version:1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        person.addObserver(new MyObserver());
        person.setName("张三");
        person.setAge("20");
    }
}
