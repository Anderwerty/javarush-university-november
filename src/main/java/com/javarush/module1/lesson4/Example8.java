package com.javarush.module1.lesson4;

public class Example8 {

    public static void main(String[] args) {
        {
            System.out.println("Hello");
            System.out.println("Block -1");

            {
                System.out.println("Block -2");;
                {};
            }
        }
    }
}
