package com.designPattern.prototype.deep;

import java.io.Serializable;

/**
 * @className:Jingubang
 * @desc:
 * @author:zzb
 * @date:2020/6/28:10 version:1.0
 **/
public class Jingubang implements Serializable {
    private int h=100;
    private int d=10;

    public void big(){
        h *=2;
        d *=2;
    }

    public void small(){
        h /=2;
        d /=2;
    }
    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
