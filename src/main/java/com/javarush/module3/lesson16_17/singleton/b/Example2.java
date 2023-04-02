package com.javarush.module3.lesson16_17.singleton.b;

public class Example2 {
    public static void main(String[] args) {
        Singleton.getInstance().method();
    }

}

class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("constructor");
    }

    public void method() {
        System.out.println("functionality");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
