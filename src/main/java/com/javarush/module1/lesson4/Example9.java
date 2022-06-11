package com.javarush.module1.lesson4;

public class Example9 {
    public static void main(String[] args) {
        int mark = 0; // 0,5

        int number = 1;

        if (number < 2) {
            mark = 5;
        } else {
            mark = 0;
        }

        //==========================

        if (number < 2) mark = 5;else mark = 0;

        //
        mark = (number < 2)? 5:0;

        if (number < 2) {
            System.out.println(5);
        } else {
            System.out.println(0);
        }
    }
}
