package com.designPattern.prototype.deep;

import java.io.Serializable;
import java.util.Date;

/**
 * @className:QiTianDaShen
 * @desc:
 * @author:zzb
 * @date:2020/6/28:13 version:1.0
 **/
public class QiTianDaShen extends Monkey implements Serializable,Cloneable {
    private Jingubang jingubang;
    public QiTianDaShen(){
     //初始化
     this.jingubang = new Jingubang();
     this.setBirthday(new Date());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deep();
    }

    public Jingubang getJingubang() {
        return jingubang;
    }

    public void setJingubang(Jingubang jingubang) {
        this.jingubang = jingubang;
    }

    public Object deep(){
        QiTianDaShen qiTianDaShen = new QiTianDaShen();
        qiTianDaShen.setBirthday(new Date());
        Jingubang jingubang = new Jingubang();
        qiTianDaShen.setJingubang(jingubang);
        return qiTianDaShen;
    }
}
