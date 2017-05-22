package com.valyria.structure.bridge;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }

}
