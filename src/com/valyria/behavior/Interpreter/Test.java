package com.valyria.behavior.Interpreter;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Test {
    public static void main(String[] args) {
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
