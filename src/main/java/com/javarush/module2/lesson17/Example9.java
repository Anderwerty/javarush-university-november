package com.javarush.module2.lesson17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Example9 {
    public static void main(String[] args) {
        ClassLoader classLoader = Example9.class.getClassLoader();

        IA proxy = (IA) Proxy.newProxyInstance(classLoader, new Class<?>[]{IA.class}, (obj, m, argList) ->
        {
            long start = System.currentTimeMillis();
            Object result = InvocationHandler.invokeDefault(obj, m, argList);
            long end = System.currentTimeMillis();

            System.out.println("Result time: " + (end - start) + "ms");

            return result;
        });

        proxy.execute();
    }
}


interface IA {
    default void execute(){
        System.out.println("default");
    };
}
