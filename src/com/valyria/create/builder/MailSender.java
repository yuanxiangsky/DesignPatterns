package com.valyria.create.builder;


/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail sender!");
    }
}
