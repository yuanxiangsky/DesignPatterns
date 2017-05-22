package com.valyria.create.abstractfactory;

/**
 * Created by YuanXiang on 2017/5/22.
 *
 */
public class SendSmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
