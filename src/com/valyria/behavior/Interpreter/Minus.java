package com.valyria.behavior.Interpreter;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Minus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
