package com.designPattern.memento;

/**
 * @className:Memento
 * @desc:用于备份的，和被被备份的具有完全相同的属性
 * @author:zzb
 * @date:2021/4/1520:39 version:1.0
 **/
public class Memento {
    private String name ;
    private int age;
    private String sex;

    public Memento(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
