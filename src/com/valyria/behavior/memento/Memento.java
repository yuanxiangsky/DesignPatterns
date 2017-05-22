package com.valyria.behavior.memento;

/**
 * Created by YuanXiang on 2017/5/22.
 */
public class Memento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
