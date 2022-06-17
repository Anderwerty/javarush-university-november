package com.javarush.module1.lesson6;

public class Example6 {
    public static void main(String[] args) {
        int times = 100;

        for (int i = 1; i < times; i++) {
            if (i % 5 == 0 && i % 7 == 0) { // check if Kobzar
                System.out.println("Not Kobzar");
                break;
            }

            System.out.println("Find kobzar: " + i);
        }
    }
}
