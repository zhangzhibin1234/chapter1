package com.designPattern.interpret;

/**
 * @className:Context
 * @desc: 解释器上下文
 * @author:zzb
 * @date:2021/3/1122:46 version:1.0
 **/
public class Context {
    private String intput;
    private int output;

    public String getIntput() {
        return intput;
    }

    public void setIntput(String intput) {
        this.intput = intput;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
