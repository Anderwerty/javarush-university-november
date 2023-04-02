package com.javarush.module3.lesson16_17.singleton.f;

public class Example6 {
    public static void main(String[] args) {
Singleton.INSTANCE1.method();
    }
}

enum Singleton {
    INSTANCE1(10), INSTANCE2(1000);

    private final int value;

    Singleton(int value) {
        this.value = value;
    }

    public void method() {
        System.out.println("functionality");
    }
}
