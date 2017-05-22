package com.valyria.behavior.strategy;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Plus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
