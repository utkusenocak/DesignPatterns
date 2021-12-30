package com.utkusenocak.observerpattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
