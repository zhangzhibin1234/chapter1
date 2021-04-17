package com.designPattern.command;

/**
 * @className:AbstractCommand
 * @desc:command抽象类
 * @author:zzb
 * @date:2021/4/1721:52 version:1.0
 **/
public abstract class AbstractCommand {
    private Peddler peddler;

    public Peddler getPeddler() {
        return peddler;
    }

    public AbstractCommand(Peddler peddler) {
        this.peddler = peddler;
    }

    public abstract void sail();
}
