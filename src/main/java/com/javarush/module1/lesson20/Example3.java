package com.javarush.module1.lesson20;

public class Example3 {
    public static void main(String[] args) {

        final Singleton instance = Singleton.INSTANCE;

        final SingletonLazy instance1 = SingletonLazy.getInstance();

        final EnumSingleton enumSingleton = EnumSingleton.ENUM_SINGLETON;
    }
}

// SOLID
class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public void method() {
        System.out.println("do something");
    }
}

class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }

        return instance;
    }

    public void method() {
        System.out.println("do something");
    }
}

enum EnumSingleton{
    ENUM_SINGLETON;

    public void method() {
        System.out.println("do something");
    }
}

//** singleton implementation with static class?
