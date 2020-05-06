package com.designPattern.facotry.simple;

import com.designPattern.facotry.Milk;
import com.designPattern.facotry.Mneniu;
import com.designPattern.facotry.Telunsu;
import com.designPattern.facotry.Yili;

/**
 * @className:SimpleFactory
 * @desc:
 * @author:zzb
 * @date:2020/5/614:49 version:1.0
 **/
public class SimpleFactory {
    public Milk getMilk(String name){
        if (name.equals("蒙牛")){
            return new Mneniu();
        }else if(name.equals("伊利")){
            return new Yili();
        }else if(name.equals("特仑苏")){
            return new Telunsu();
        }else {
            System.out.println("请输入正确的牛奶");
            return null;
        }

    }
}
