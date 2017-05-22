package com.valyria.behavior.visitor;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Test {

    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
