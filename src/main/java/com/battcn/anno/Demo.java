package com.battcn.anno;

import java.lang.reflect.Method;

/**
 * @className:Demo
 * @desc:
 * @author:zzb
 * @date:2019/8/523:16 version:1.0
 **/
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException {
        Class c = Stu.class;
        MyAnno myAnno = (MyAnno) c.getAnnotation(MyAnno.class);
        System.out.println(myAnno.value());
        Method m = c.getMethod("show",null);
        MyAnno myAnno1 = (MyAnno) m.getAnnotation(MyAnno.class);
        System.out.println(myAnno1.value());
    }
}
