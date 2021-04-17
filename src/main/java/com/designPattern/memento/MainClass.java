package com.designPattern.memento;

/**
 * @className:MainClass
 * @desc:备忘录模式，是行为模式之
 * 一，它的作用是保存对象的内部状态，并在需要
 * 的时候（undo/rollback）恢复对象以前的状态
 * @author:zzb
 * @date:2021/4/1520:34 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        Person zhangsan =new Person("张三",20,"男");

        System.out.println(zhangsan);

        System.out.println("=====================");

        //通过管理者设置备份对象
        Caketer caketer = new Caketer();
        caketer.setMemento(zhangsan.creatMemento());

        //修改张三的属性
        zhangsan.setAge(30);
        zhangsan.setSex("女");

        System.out.println(zhangsan);
        System.out.println("==================");

        zhangsan.setMemento(caketer.getMemento());

        System.out.println(zhangsan);

    }
}
