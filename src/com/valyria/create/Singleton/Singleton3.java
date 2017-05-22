package com.valyria.create.Singleton;

/**
 * Created by YuanXiang on 2017/5/22.
 * 比较完美的的解决方案
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3(){

    }
    private static synchronized void  initInstance(){
        if(instance==null)
            instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        if(instance==null)
            initInstance();
        return instance;
    }
}
