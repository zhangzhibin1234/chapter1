package com.designPattern.prototype.simple;

import java.util.ArrayList;

/**
 * @className:PersonTest
 * @desc:
 * @author:zzb
 * @date:2020/6/28:02 version:1.0
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person xm = new Person();
        xm.name="小名";
        xm.age="16";
        xm.friends=new ArrayList<String>();
        xm.friends.add("zhangsan");
        Person ls=null;
        try {
            ls =(Person) xm.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(xm.friends==ls.friends);
        System.out.println(ls.age==xm.age);
    }
}
