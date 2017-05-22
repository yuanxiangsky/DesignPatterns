package com.valyria.create.factorymethod;

/**
 * Created by YuanXiang on 2017/5/22.
 * 多个工厂方法模式
 */
public class SendFactory2 {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
