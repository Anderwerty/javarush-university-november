package com.javarush.module2.lesson10;

public class Example2 {
    public static void main(String[] args) {
        countDown(2);
    }

    public static void countDown(int x) { //infinitive loop
        System.out.println(x);
        countDown(x - 1);
    }
}
