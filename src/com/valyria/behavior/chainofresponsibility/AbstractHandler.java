package com.valyria.behavior.chainofresponsibility;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public abstract class AbstractHandler {

    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }
}
