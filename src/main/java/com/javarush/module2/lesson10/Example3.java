package com.javarush.module2.lesson10;

public class Example3 {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        System.out.println("-".repeat(16));
        System.out.println("with loop");

        start = System.nanoTime();
        countDownWithLoop(1_000_00);
        end = System.nanoTime();
        System.out.println(end - start);

        System.out.println("-".repeat(16));
        System.out.println("recursion");

        start = System.nanoTime();
        countDown(1_000_000);
        end = System.nanoTime();

        System.out.println(end - start);
    }

    public static void countDown(int x) { //2
        if (x <= 0)
            System.out.println("Boom!");
        else {
//            System.out.println(x);
            countDown(x - 1);
        }
    }

    public static void countDownWithLoop(int x) {
        for (int i = x; i > 0; i--) {
//            System.out.println(i);
        }

        System.out.println("Boom!");
    }
}
