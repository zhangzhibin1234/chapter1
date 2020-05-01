package com.designPattern.singletonMode;

/**
 * @className:PersonSync
 * @desc:
 * @author:zzb
 * @date:2019/9/2621:07 version:1.0
 **/
public class PersonSync {
    private PersonSync() {
    }

    private static PersonSync personSync;

    //    public synchronized static PersonSync getPerson1(){
//        if (null ==PersonSync) {
//            PersonSync = new PersonSync();
//        }
//        return PersonSync;
//    }
    /**
     * @author:zzb
     * @desc:加双重锁，保证效率和线程安全
     * @date:21:16 2019/9/26
     * @param:[]
     * @return:com.designPattern.singletonMode.PersonSync
     **/
    public static PersonSync getPersonSync() {
            if (null == personSync) {
                synchronized (PersonSync.class) {
                    if (null == personSync) {
                        personSync = new PersonSync();
                    }
                }

        }
        return personSync;
    }
}
