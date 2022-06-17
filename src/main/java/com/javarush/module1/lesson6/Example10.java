package com.javarush.module1.lesson6;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isWorking = true;
        while (isWorking) {
            String s = console.nextLine();
            if ("exit".equals(s)) {
                isWorking = false;
            } else {
                System.out.println("User prints: " + s);
            }
        }
    }
}
