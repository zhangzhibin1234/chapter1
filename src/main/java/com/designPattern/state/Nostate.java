package com.designPattern.state;

/**
 * @className:Nostate
 * @desc:
 * @author:zzb
 * @date:2021/4/1521:45 version:1.0
 **/
public class Nostate extends State {
    @Override
    public void doSomething(Person person) {
        System.out.println(person.getHour()+":未定义");
    }
}
