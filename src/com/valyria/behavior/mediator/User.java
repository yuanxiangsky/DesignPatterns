package com.valyria.behavior.mediator;

import com.valyria.behavior.memento.Memento;

import javax.print.attribute.standard.Media;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();

}
