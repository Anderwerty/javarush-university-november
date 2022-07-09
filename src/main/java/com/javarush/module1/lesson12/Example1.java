package com.javarush.module1.lesson12;

public class Example1 {
    public static void main(String[] args) {
        double a = 0; // x
        double b = 0; //

        double x = a / b;
        System.out.println(x);

        if (x == Double.POSITIVE_INFINITY) {
            System.out.println("too big");
        } else if (x == Double.NEGATIVE_INFINITY) {
            System.out.println("too small");
        } else if (x == Double.NaN) {
            System.out.println("not a number");
        }

        System.out.println(0 / Double.POSITIVE_INFINITY);
        System.out.println(-Double.POSITIVE_INFINITY / 0);
        System.out.println(Double.NaN / Double.POSITIVE_INFINITY);
        //
        System.out.println(Double.NaN * 0);
        //


        System.out.println(Double.POSITIVE_INFINITY == Float.POSITIVE_INFINITY);
    }
}
