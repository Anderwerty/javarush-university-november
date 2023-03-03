package com.javarush.module3.lesson16_17.singleton.e;


public class Example4 {
    public static void main(String[] args) {
        Singleton.getInstance().method();
    }

}

class Singleton {
    private static final Object LOCK = new Object();

    private static volatile Singleton instance;

    private int value;

    private Singleton() {
        System.out.println("constructor");
    }

    public void method() {
        System.out.println("functionality");
    }

//    public int getValue() {
//        return value;
//    }

    private void setValue(int value) {
        this.value = value;
    }

    public static Singleton getInstance() {

        if (instance == null) {  //2-thread
            synchronized (LOCK) {
                if (instance == null) {
                    Singleton singleton = new Singleton();
                    //somelogic
                    singleton.setValue(100);
                    instance = singleton;
//
//
//                    instance = new Singleton();  // 1 -thread
//                    // somelogic
//                    instance.setValue(100);
                }
            }
        }

        return instance;
    }

}



