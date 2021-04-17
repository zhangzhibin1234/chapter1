package com.designPattern.command;

/**
 * @className:Peddler
 * @desc: 商贩类，需要被调用的目标对象
 * @author:zzb
 * @date:2021/4/1721:50 version:1.0
 **/
public class Peddler {
    /**
     * @author:zzb
     * @desc:买苹果
     * @date:21:52 2021/4/17
     * @param:[]
     * @return:void
     **/
    public void sailApple(){
        System.out.println("买苹果");
    }
    /**
     * @author:zzb
     * @desc:买香蕉
     * @date:21:52 2021/4/17
     * @param:[]
     * @return:void
     **/
    public void sailBanana(){
        System.out.println("买香蕉");
    }
}
