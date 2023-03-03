package com.javarush.module3.lesson16.singleton.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example1 {
    public static void main(String[] args) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton instance = Singleton.INSTANCE;
        instance.method();

        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);
        Singleton singleton = declaredConstructor.newInstance();
        singleton.method();

        System.out.println(instance == singleton);
    }
}

class Singleton {

    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("constructor");
    }

    public void method() {
        System.out.println("functionality");
    }

}
