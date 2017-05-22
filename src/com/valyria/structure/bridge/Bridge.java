package com.valyria.structure.bridge;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }


}
