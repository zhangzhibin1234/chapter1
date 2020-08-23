package com.junitTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className:DobaOrderRPC
 * @desc:
 * @author:zzb
 * @date:2020/8/217:51 version:1.0
 **/
@Service
public class DobaOrderRPC {
    @Autowired
    private StringUtilTs stringUtilTs;
    private  String s="hahaha";

    public String getTOKEN(){
        return getTOKEN();
    }

    public String getString(){
        return StringUtilTs.getString(s);
    }

    public String getHello(){
        return stringUtilTs.getHello();
    }
}
