package com.valyria.behavior.visitor;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MyVisitor implements Visitor{
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
