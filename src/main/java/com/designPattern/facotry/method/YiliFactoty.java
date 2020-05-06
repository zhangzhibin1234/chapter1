package com.designPattern.facotry.method;

import com.designPattern.facotry.Milk;
import com.designPattern.facotry.Yili;

/**
 * @className:YiliFactoty
 * @desc:
 * @author:zzb
 * @date:2020/5/615:03 version:1.0
 **/
public class YiliFactoty implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
