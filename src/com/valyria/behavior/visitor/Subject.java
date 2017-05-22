package com.valyria.behavior.visitor;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public interface Subject {

    public void accept(Visitor visitor);

    public String getSubject();
}
