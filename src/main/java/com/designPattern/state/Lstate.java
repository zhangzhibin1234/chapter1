package com.designPattern.state;


/**
 * @className:Lstate
 * @desc:
 * @author:zzb
 * @date:2021/4/1521:38 version:1.0
 **/
public class Lstate extends State {
    @Override
    public void doSomething(Person person) {
        if(person.getHour()==18){
            System.out.println("吃晚餐");
        }else{
            person.setState(new Nostate());
            person.doSomething();
        }
    }
}
