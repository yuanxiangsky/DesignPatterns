package com.valyria.create.Singleton;

/**
 * Created by YuanXiang on 2017/5/22.
 * 单例模式,该方式会有同步问题，重点在于对创建的时候进行枷锁
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();
        return instance;
    }
}
