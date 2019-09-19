package com.battcn.anno;

/**
 * @className:Demo1
 * @desc:
 * @author:zzb
 * @date:2019/8/523:05 version:1.0
 **/
@MyAnno1(name="张三",value = 10)
public class Demo1 {
    @MyAnno1(name="lisi",sex = {"male"})
    public void show(){

    }
}
