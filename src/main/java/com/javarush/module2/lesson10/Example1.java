package com.javarush.module2.lesson10;

public class Example1 {
    public static void main(String[] args) {
        countDown(2);
    }

    public static void countDown(int x) {
        if (x <= 0)
            System.out.println("Boom!");
        else {
            System.out.println(x);
            countDown(x - 1);
        }
    }
}
