package com.designPattern.observer;

import java.util.Observable;

/**
 * @className:Person
 * @desc:被观察者，当一些属性发生变化的话，会通知观察者
 * @author:zzb
 * @date:2021/2/2821:03 version:1.0
 **/
public class Person extends Observable {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers(name);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        this.setChanged();
        this.notifyObservers(age);
    }
}
