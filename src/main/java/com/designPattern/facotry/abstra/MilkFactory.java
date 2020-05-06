package com.designPattern.facotry.abstra;

import com.designPattern.facotry.Milk;
import com.designPattern.facotry.method.MenniuFactory;
import com.designPattern.facotry.method.TelunsuFactory;
import com.designPattern.facotry.method.YiliFactoty;

/**
 * @className:MilkFactory
 * @desc:
 * @author:zzb
 * @date:2020/5/615:36 version:1.0
 **/
public class MilkFactory extends AbstractFactory {
    @Override
    Milk getMenniu() {
        return new MenniuFactory().getMilk();
    }

    @Override
    Milk getYili() {
        return new YiliFactoty().getMilk();
    }

    @Override
    Milk getTelunsu() {
       return new TelunsuFactory().getMilk();
    }
}
