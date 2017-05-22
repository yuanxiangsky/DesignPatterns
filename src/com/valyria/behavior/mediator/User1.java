package com.valyria.behavior.mediator;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class User1 extends User {
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
