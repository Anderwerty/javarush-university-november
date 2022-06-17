package com.javarush.module1.lesson6;

public class Example11 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 23) { // for (int i =0; i<=23; i++)
            if ((i % 7) == 0) {
//                i++;
                continue;
            }

            System.out.println(i);
            i++;
        }
    }
}
