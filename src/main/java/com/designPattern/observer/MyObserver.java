package com.designPattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @className:MyObserver
 * @desc:
 * @author:zzb
 * @date:2021/2/2821:06 version:1.0
 **/
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Person p = (Person) o;
        System.out.println("被观察者通知我了，哈哈哈哈"+p.getName()+":"+p.getAge());
    }
}
