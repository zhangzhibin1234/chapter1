package com.designPattern.singletonMode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @className:MainClass
 * @desc:
 * @author:zzb
 * @date:2019/9/2620:56 version:1.0
 **/
public class MainClass {


    public static void main(String[] args) throws Exception {
//        Person p1 = Person.getPerson();
//        Person p2 = Person.getPerson();
//        System.out.println(p1==p2);
//        Person1 person1 = Person1.getPerson1();
//        Person1 person2 = Person1.getPerson1();
//        System.out.println(person1==person2);
//        PersonSync personSync = PersonSync.getPersonSync();
//        PersonSync personSync1 = PersonSync.getPersonSync();
//        System.out.println(personSync==personSync1);
//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH");
//        String stringDate = dateFormat.format(date);
//        System.out.println(stringDate);
//        Date parseDate = dateFormat.parse(stringDate);
//        System.out.println(parseDate);
 //       System.out.println(System.currentTimeMillis() +"");
        try {
            int a =5/1;
            System.out.println("hahaha");
        } catch (Exception e) {
            System.out.println("cuolecuole");
            throw new RuntimeException("gtcg异常0");
        }
        System.out.println("你好啊");
    }
}
