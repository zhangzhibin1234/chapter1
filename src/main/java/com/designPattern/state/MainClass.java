package com.designPattern.state;

/**
 * @className:MainClass
 * @desc: State模式也叫状态模式，是行为设计模式的
 * 一种。State模式允许通过改变对象的内部状态
 * 而改变对象的行为，这个对象表现得就好像修改
 * 了它的类一样。  状态模式主要解决的是当控制一个对象状态转
 * 换的条件表达式过于复杂时的情况。把状态的判
 * 断逻辑转译到表现不同状态的一系列类当中，可
 * 以把复杂的判断逻辑简化
 * @author:zzb
 * @date:2021/4/1521:34 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setHour(7);
        person.doSomething();

        person.setHour(12);
        person.doSomething();

        person.setHour(18);
        person.doSomething();

        person.setHour(19);
        person.doSomething();

        person.setHour(7);
        person.doSomething();
        person.setHour(11);
        person.doSomething();

    }
}
