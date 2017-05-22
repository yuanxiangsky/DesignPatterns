package com.valyria.behavior.memento;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }


}
