package com.javarush.module1.lesson12;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        String friend1 = "dddd";
        String friend2 = friend1;

        friend1 = null;

        System.out.println(friend2);

        String friend3 = new String("dddd");
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
    }
}
