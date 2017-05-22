package com.valyria.behavior.command;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void action(){
        command.exec();
    }
}
