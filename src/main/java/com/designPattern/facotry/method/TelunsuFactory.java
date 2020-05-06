package com.designPattern.facotry.method;

import com.designPattern.facotry.Milk;
import com.designPattern.facotry.Telunsu;

/**
 * @className:TelunsuFactory
 * @desc:
 * @author:zzb
 * @date:2020/5/615:04 version:1.0
 **/
public class TelunsuFactory implements MilkFactory{
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
