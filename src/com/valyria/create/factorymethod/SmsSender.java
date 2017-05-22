package com.valyria.create.factorymethod;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("sms sender!");
    }
}
