package com.battcn.Lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @className:LambdaDemo1
 * @desc:
 * @author:zzb
 * @date:2019/6/1521:36 version:1.0
 **/
public class LambdaDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan","lisi");
        list.forEach(name->{
            System.out.println(name);
        });
    }
}
