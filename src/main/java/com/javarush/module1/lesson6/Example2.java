package com.javarush.module1.lesson6;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input times: ");
        int times = scanner.nextInt();//0 -4

        for (int i = 0; i < times; i++) {
            System.out.println(i);
        }

    }
}
