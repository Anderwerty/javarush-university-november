package com.javarush.module3.lesson16.singleton.g;

public class Example7 {
    public static void main(String[] args) {
        Singleton.SingletonHandler.getInstance().method();
    }
}

class Singleton {

    private Singleton() {

    }

    public void method() {
        System.out.println("work...");
    }


    public static final class SingletonHandler {

        private static final Singleton INSTANCE = new Singleton();

        private SingletonHandler(){}

        public static Singleton getInstance() {
            return INSTANCE;
        }
    }
}
