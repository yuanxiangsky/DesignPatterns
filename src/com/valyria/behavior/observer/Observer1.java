package com.valyria.behavior.observer;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
