package com.javarush.module1.lesson6;

public class Example9 {
    public static void main(String[] args) {
        int wight = 100;
        int height = 50;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= wight; j++) {
                if (i == 1 || i == height) {
                    System.out.print("*");
                } else if (j == 1 || j == wight) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}


// *********  // i = 1 || i = height
// *       *  // j = 1 || j = wight
// *       *
// *********
