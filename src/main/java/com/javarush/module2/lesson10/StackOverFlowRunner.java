package com.javarush.module2.lesson10;

public class StackOverFlowRunner {
    public static void main(String[] args) {
        try {
            countDown(0);
        } catch (StackOverflowError error) {
            System.out.println("error");
        }
        System.out.println("========================");
        for (int i = 0; i < 100; i++) {
            int value = 10;
            System.out.println(i + value);
        }

    }

    public static void countDown(int x) { //infinitive loop
        System.out.println(x);
        countDown(x - 1);
    }

}
