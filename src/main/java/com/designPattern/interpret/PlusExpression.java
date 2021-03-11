package com.designPattern.interpret;

/**
 * @className:PlusExpression
 * @desc:解释器具体实现类
 * @author:zzb
 * @date:2021/3/1122:48 version:1.0
 **/
public class PlusExpression  extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("自增解释器");
        int intIntput =Integer.parseInt(context.getIntput());
        ++intIntput;
        //解释后上下文重新设置原来的值
        context.setIntput(String.valueOf(intIntput));
        context.setOutput(intIntput);
    }
}
