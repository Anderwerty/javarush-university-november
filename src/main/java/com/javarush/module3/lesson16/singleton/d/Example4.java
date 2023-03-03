package com.javarush.module3.lesson16.singleton.d;


public class Example4 {
    public static void main(String[] args) {
        Singleton.getInstance().method();
    }

}

class Singleton {
    private static final Object LOCK = new Object();

    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("constructor");
    }

    public void method() {
        System.out.println("functionality");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}



