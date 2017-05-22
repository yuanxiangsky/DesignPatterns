package com.valyria.behavior.command;

import com.valyria.structure.facade.Computer;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class MyCommand implements Command{

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void exec() {
        receiver.action();
    }
}
