package com.javarush.module1.lesson12;

public class Example2 {
    public static void main(String[] args) {
        char symbol = '\u0000';
        System.out.println("[" + symbol + "]");

        for (char i = 0; i < 200 ; i++) {
            System.out.println(i);
        }

        char letter = 'a';
        char number = '1';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isDigit(letter));

        System.out.println(Character.isLetter(number));
        System.out.println(Character.isDigit(number));
    }
}
