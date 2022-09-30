package com.javarush.module2.lesson4;

public class Example3 {
    public static void main(String... args) {
        System.out.println("Hello");

        System.out.println(max(1, -1));
        System.out.println(max(1, -1, 1));
        System.out.println(max(1, -1, 1, 10, 31, 100, 103));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int max(int a, int b, int c) {
//        int ab = max(a, b);
//        int abc = max(ab, c);
//        return abc;

        return max(max(a, b), c);
    }

    public static int max(int... items) {
        int max = items[0];
        for (int item : items) {
            max = max(max, item);
        }

        return max;
    }


}
