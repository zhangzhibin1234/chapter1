package com.designPattern.command;

/**
 * @className:Waittor
 * @desc:具体执行命令的服务员类
 * @author:zzb
 * @date:2021/4/1721:57 version:1.0
 **/
public class Waittor {
    private AbstractCommand command;

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void sail (){
        command.sail();
    }
}
