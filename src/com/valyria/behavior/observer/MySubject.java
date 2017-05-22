package com.valyria.behavior.observer;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MySubject extends AbstractSubject {
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
