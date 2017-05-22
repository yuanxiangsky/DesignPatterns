package com.valyria.behavior.observer;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
