package com.designPattern.state;

/**
 * @className:Astate
 * @desc:
 * @author:zzb
 * @date:2021/4/1521:38 version:1.0
 **/
public class Astate extends State{
    @Override
    public void doSomething(Person person) {
        if(person.getHour()==12){
            System.out.println("吃午餐");
        }else{
            person.setState(new Lstate());
            person.doSomething();
        }
    }
}
