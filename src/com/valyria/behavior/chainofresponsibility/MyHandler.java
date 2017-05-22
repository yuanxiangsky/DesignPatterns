package com.valyria.behavior.chainofresponsibility;

import com.valyria.behavior.observer.AbstractSubject;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MyHandler extends AbstractHandler implements Handler{
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void oprator() {
        System.out.println(name+" deal");
        if(getHandler() !=null){
            getHandler().oprator();            //传递下去
        }
    }
}
