package com.designPattern.interpret;

/**
 * @className:MainClass
 * @desc: Interpreter模式也叫解释器模式，是行为模式之一，它
 * 是一种特殊的设计模式，它建立一个解释器，对于特定
 * 的计算机程序设计语言，用来解释预先定义的文法。简
 * 单地说，Interpreter模式是一种简单的语法解释器构架。
 * @author:zzb
 * @date:2021/3/1122:45 version:1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        Context context = new Context();
        context.setIntput("10");
        AbstractExpression expression = new PlusExpression();
        AbstractExpression minusExpression= new MinusExpression();
         expression.interpret(context);
        System.out.println(context.getOutput());
         minusExpression.interpret(context);
        System.out.println(context.getOutput());
    }
}
