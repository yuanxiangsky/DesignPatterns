package com.valyria.behavior.visitor;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MySubject implements Subject{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
