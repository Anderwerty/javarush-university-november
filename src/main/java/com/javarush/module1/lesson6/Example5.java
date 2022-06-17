package com.javarush.module1.lesson6;

public class Example5 {
    public static void main(String[] args) {

        int times = 0;
        do {
            System.out.println(--times);
            System.out.println(times);
        }
        while (times > 0);
    }
}
