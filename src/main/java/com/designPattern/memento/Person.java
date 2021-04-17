package com.designPattern.memento;

/**
 * @className:Person
 * @desc:
 * @author:zzb
 * @date:2021/4/1520:37 version:1.0
 **/
public class Person {
    private String name ;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
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
    /**
     * @author:zzb
     * @desc:创建一个备份对象
     * @date:20:42 2021/4/15
     * @param:[]
     * @return:com.designPattern.memento.Memento
     **/
    public Memento creatMemento(){
        return new Memento(name,age,sex);
    }
    /**
     * @author:zzb
     * @desc:恢复对象，还原
     * @date:20:43 2021/4/15
     * @param:[memento]
     * @return:void
     **/
    public void setMemento(Memento memento){
        this.name=memento.getName();
        this.sex=memento.getSex();
        this.age = memento.getAge();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex='").append(sex).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
