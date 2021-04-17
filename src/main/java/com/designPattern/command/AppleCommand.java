package com.designPattern.command;

/**
 * @className:AppleCommand
 * @desc:命令类的具体实现
 * @author:zzb
 * @date:2021/4/1721:54 version:1.0
 **/
public class AppleCommand extends AbstractCommand {
    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sail() {
        this.getPeddler().sailApple();
    }
}
