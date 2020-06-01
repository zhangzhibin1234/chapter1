package com.designPattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className:Register
 * @desc:注册时单例
 * @author:zzb
 * @date:2020/6/17:20 version:1.0
 **/
public class Register {
    //构造函数私有化
    private Register(){}
    private static Map registerMap = new ConcurrentHashMap();
    public static Register getInstance(String name){
        if(null ==name){
            name =Register.class.getName();
        }
        if(null==registerMap.get(name)){
            registerMap.put(name,new Register());
        }
        return (Register) registerMap.get(name);
    }
}
