package com.designPattern.templateMethod;

/**
 * @className:MakeJeep
 * @desc:
 * @author:zzb
 * @date:2021/4/1322:31 version:1.0
 **/
public class MakeJeep extends MakeCar {
    @Override
    void makeHead() {
        System.out.println("jeep:制作车头");
    }

    @Override
    void makeBody() {
        System.out.println("jeep:制作车身");
    }

    @Override
    void makeTail() {
        System.out.println("jeep:制作车尾");
    }
}
