package com.designPattern.prototype.deep;

/**
 * @className:QitianDaShenTest
 * @desc:
 * @author:zzb
 * @date:2020/6/28:18 version:1.0
 **/
public class QitianDaShenTest {
    public static void main(String[] args) {
        QiTianDaShen q1= new QiTianDaShen();
        QiTianDaShen q2=null;
        try {
            q2= (QiTianDaShen)q1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(q1.getBirthday()==(q2.getBirthday()));
        System.out.println(q1.getJingubang()==q2.getJingubang());
    }
}
