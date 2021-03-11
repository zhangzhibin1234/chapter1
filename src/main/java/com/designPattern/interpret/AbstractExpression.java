package com.designPattern.interpret;

/**
 * @className:AbstractExpression
 * @desc:抽象的解释器
 * @author:zzb
 * @date:2021/3/1122:47 version:1.0
 **/
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
