package com.designPattern.facotry.abstra;

import com.designPattern.facotry.Milk;

/**
 * @className:AbstractFactory
 * @desc:
 * @author:zzb
 * @date:2020/5/615:34 version:1.0
 **/
public abstract class AbstractFactory {
    abstract Milk getMenniu();
    abstract Milk getYili();
    abstract Milk getTelunsu();
}
