package com.utkusenocak.singletonpattern;

public class SingleObject {

    //Create an object of SingleObject
    private static final SingleObject instance = new SingleObject();

    //Make the constructor private so that this class can not be instantiated
    private SingleObject() {}

    //Get the only object available

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
