package com.javarush.module1.lesson4;

public class Example7 {
    public static void main(String[] args) {
        // 1 - green
        // 2 -yellow
        // not 1 or not 2 - red

        int status = 3;

        if (status == 1) {
            System.out.println("Go");
        } else {
            if (status == 2) {
                System.out.println("Ready");
            } else {
                System.out.println("Wait");
            }
        }
        //==========================

        if (status == 1) {
            System.out.println("Go");
        } else if (status == 2) {
            System.out.println("Ready");
        } else {
            System.out.println("Wait");
        }

        //===============================
        if (status == 1) {
            System.out.println("Go");
        }
        if (status == 2) {
            System.out.println("Ready");
        }
        if (status != 1 && status != 2) {
            System.out.println("Wait");
        }
    }
}
