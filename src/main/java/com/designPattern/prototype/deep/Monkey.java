package com.designPattern.prototype.deep;

import java.io.Serializable;
import java.util.Date;

/**
 * @className:Monkey
 * @desc:
 * @author:zzb
 * @date:2020/6/28:08 version:1.0
 **/
public class Monkey implements Serializable {
    private  int weigth;
    private  Date birthday;

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
