package com.designPattern.singletonMode;

/**
 * @className:Person
 * @desc:饿汉式
 * @author:zzb
 * @date:2019/9/2620:53 version:1.0
 **/
public class Person {
    private String name;
    private Person(){}
    private static final Person person = new Person();
    public static Person getPerson(){
        return person;
    }
}
