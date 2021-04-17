package com.designPattern.templateMethod;

/**
 * @className:MakeCar
 * @desc:
 * @author:zzb
 * @date:2021/4/1322:23 version:1.0
 **/
public abstract class MakeCar {

    abstract void makeHead();

    abstract void makeBody();

    abstract  void makeTail();

    public void make(){
        makeHead();
        makeBody();
        makeTail();
    }
}
