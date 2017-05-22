package com.valyria.structure.decorator;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the origin method!");
    }
}
