package com.designPattern.memento;

/**
 * @className:Caketer
 * @desc:备份对象管理和拥有者
 * @author:zzb
 * @date:2021/4/1520:45 version:1.0
 **/
public class Caketer {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
