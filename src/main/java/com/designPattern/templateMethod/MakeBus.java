package com.designPattern.templateMethod;

/**
 * @className:MakeBus
 * @desc:
 * @author:zzb
 * @date:2021/4/1322:30 version:1.0
 **/
public class MakeBus extends MakeCar {
    @Override
    void makeHead() {
        System.out.println("bus:制作车头");
    }

    @Override
    void makeBody() {
        System.out.println("bus:制作车身");
    }

    @Override
    void makeTail() {
        System.out.println("bus:制作车尾");
    }
}
