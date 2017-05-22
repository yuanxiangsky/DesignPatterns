package com.valyria.behavior.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<Observer>();
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}
