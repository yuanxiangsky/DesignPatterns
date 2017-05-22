package com.valyria.behavior.templatemethod;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Plus extends AbstractCalculator{
    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
