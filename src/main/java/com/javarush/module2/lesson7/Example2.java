package com.javarush.module2.lesson7;

public class Example2 {
    public static void main(String[] args) {
        long lv = 1;

        int iv = (int) 1L;


        byte bv1 = 100;
        byte bv2 = 100;

        byte bv3 = (byte) (bv1 + bv2);

        char symbol = 'k';
        int vic = symbol;

        char c1 = 'f';
        char c2 = 'd';

        System.out.println((char)(c1 * c2));


    }
}


