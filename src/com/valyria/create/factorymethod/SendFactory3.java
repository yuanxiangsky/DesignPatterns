package com.valyria.create.factorymethod;

/**
 * Created by YuanXiang on 2017/5/22.
 * 静态工厂模式，常用
 */
public class SendFactory3 {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
