package com.javarush.module2.lesson14;

public class Example2 {
    public static void main(String[] args) {

        System.out.println("Hello");
        Thread.currentThread().setUncaughtExceptionHandler((thread, exception) ->
                System.out.println(exception));
        throw new IllegalArgumentException("");
    }
}
