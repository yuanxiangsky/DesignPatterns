package com.valyria.behavior.Iterator;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public interface Collection {
    public com.valyria.behavior.Iterator.Iterator iterator();

    public Object get(int i);

    public int size();

}
