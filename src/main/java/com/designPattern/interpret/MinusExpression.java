package com.designPattern.interpret;

import java.beans.Expression;

/**
 * @className:MinusExpression
 * @desc:
 * @author:zzb
 * @date:2021/3/1122:52 version:1.0
 **/
public class MinusExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("自减解释器");
        int intIntput =Integer.parseInt(context.getIntput());
        --intIntput;
        //解释后上下文重新设置原来的值
        context.setIntput(String.valueOf(intIntput));
        context.setOutput(intIntput);
    }
}
