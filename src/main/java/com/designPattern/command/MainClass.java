package com.designPattern.command;

/**
 * @className:MainClass
 * @desc:命令模式：是行为设计模
 * 式的一种。Command模式通过被称为
 * Command的类封装了对目标对象的调用行为以
 * 及调用参数。 在面向对象的程序设计中，一个对象调用另一个对象，
 * 一般情况下的调用过程是：创建目标对象实例；设置调
 * 用参数；调用目标对象的方法。但在有些情况下有必要使用一个专门的类对这种调用
 * 过程加以封装，我们把这种专门的类称作command类。- 整个调用过程比较繁杂，或者存在多处这种调用。
 * 这时，使用Command类对该调用加以封装，便于功能的
 * 再利用。- 调用前后需要对调用参数进行某些处理。- 调用前后需要进行某些额外处理，比如日志，缓存，记录历史操作等
 * @author:zzb
 * @date:2021/4/1721:48 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
        AbstractCommand appleCommand = new AppleCommand(peddler);
        Waittor waittor = new Waittor();
        waittor.setCommand(appleCommand);
        waittor.sail();
    }
}
