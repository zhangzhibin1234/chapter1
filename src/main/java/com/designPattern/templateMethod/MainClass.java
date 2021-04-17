package com.designPattern.templateMethod;

/**
 * @className:MainClass
 * @desc:具有统一的操作步骤或操作过程
 * - 具有不同的操作细节
 * - 存在多个具有同样操作步骤的应用场景，但某些具体的操作细节却各不相同
 * @author:zzb
 * @date:2021/4/1322:22 version:1.0
 **/
public class MainClass {

    public static void main(String[] args) {
        MakeCar bus = new MakeBus();
        bus.make();

        System.out.println("-------------");

        MakeCar jeep = new MakeJeep();
        jeep.make();
    }
}
