package com.designPattern.prototype.simple;

import java.util.List;

/**
 * @className:Person
 * @desc:
 * @author:zzb
 * @date:2020/6/28:00 version:1.0
 **/
public class Person implements Cloneable{
    public String name;
    public String age;
    public List<String> friends;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
