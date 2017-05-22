package com.valyria.behavior.mediator;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class User2 extends User{
    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
