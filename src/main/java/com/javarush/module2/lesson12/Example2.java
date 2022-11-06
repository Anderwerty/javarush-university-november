package com.javarush.module2.lesson12;

public class Example2 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

    }
}

class Singleton {

    private static volatile Singleton instance = null;

    private Singleton() {
    }
    //... some methods

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

