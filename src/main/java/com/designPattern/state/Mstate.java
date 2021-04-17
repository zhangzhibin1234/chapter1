package com.designPattern.state;

/**
 * @className:Mstate
 * @desc:
 * @author:zzb
 * @date:2021/4/1521:37 version:1.0
 **/
public class Mstate extends State {
    @Override
    public void doSomething(Person person) {
        if(person.getHour()==7){
            System.out.println("吃早餐");
        }else{
            person.setState(new Astate());
            person.doSomething();
        }
    }
}
