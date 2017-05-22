package com.valyria.structure.proxy;

import com.valyria.structure.decorator.Source;
import com.valyria.structure.decorator.Sourceable;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Proxy implements Sourceable{
    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }


    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
