package com.javarush.module1.lesson16;

public class Example1 {
    public static void main(String[] args) {
        Integer i = new Integer("123");
        Integer a = 10; // int -> Integer boxing

        a++; // Integer ->(outboxing) int(10) -> (increment)
        // int(11) ->(boxing) Integer(11)

        System.out.println(a);

    }
}
