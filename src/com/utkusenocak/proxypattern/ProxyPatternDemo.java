package com.utkusenocak.proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10bm.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("\n");

        //image will not be loaded from disk
        image.display();
    }
}
