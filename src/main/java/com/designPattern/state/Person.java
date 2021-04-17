package com.designPattern.state;

/**
 * @className:Person
 * @desc:
 * @author:zzb
 * @date:2021/4/1521:35 version:1.0
 **/
public class Person {
    private int hour;
    private State state;
    public Person(){
        state =new Mstate();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void doSomething(){
        state.doSomething(this);
        state= new Mstate();
    }
}
