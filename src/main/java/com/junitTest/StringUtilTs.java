package com.junitTest;

import org.springframework.stereotype.Service;

/**
 * @className:StringUtilTs
 * @desc:
 * @author:zzb
 * @date:2020/8/218:33 version:1.0
 **/
@Service
public class StringUtilTs {
    public static String getString(String s){
        return s;
    }

    public String getHello(){
        return "helloword";
    }
}
