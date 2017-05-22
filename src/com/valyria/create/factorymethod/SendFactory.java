package com.valyria.create.factorymethod;

/**
 * Created by YuanXiang on 2017/5/22.
 * 普通工厂模式，工厂类中只有一个工厂方法
 */
public class SendFactory {
    public Sender produce(String sendType){
        if(sendType.equals("mail")){
            return new MailSender();
        }else if(sendType.equals("sms")){
            return new SmsSender();
        }else
            return null;
    }

    public static void main(String[] args) {
        SendFactory sf= new SendFactory();
        sf.produce("mail").send();
    }
}
