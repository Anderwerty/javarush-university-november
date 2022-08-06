package com.javarush.module1.lesson20;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        int choose = new Scanner(System.in).nextInt();

        if (choose == 1) {
            System.out.println("1");
        } else if (choose == 2) {
            System.out.println("2");
        } else if (choose == 3) {
            System.out.println("3");
        } else if (choose == 4) {
            System.out.println("3"); // look here
        } else {
            System.out.println("100");
        }
        System.out.println("=====================");
        switch (choose){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
            case 4:
                System.out.println(3);
                break;
            default:
                System.out.println(100);
                break;

        }
    }
}
