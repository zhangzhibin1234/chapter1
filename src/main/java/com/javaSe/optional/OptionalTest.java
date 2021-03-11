package com.javaSe.optional;

import java.util.Optional;

/**
 * @className:OptionalTest
 * @desc:java8新特性Optional测试
 * @author:zzb
 * @date:2020/9/2821:41 version:1.0
 **/
public class OptionalTest {
    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        System.out.println(optionalTest.result(new Person()));
    }
    public  String result(Person person){
        return Optional.ofNullable(person).map(Person::getCar).map(Car::getInsurance).map(Insurance::getName).orElse(null);
    }
}
