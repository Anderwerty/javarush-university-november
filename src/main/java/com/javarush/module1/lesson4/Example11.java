package com.javarush.module1.lesson4;

public class Example11 {
    public static void main(String[] args) {
        int age = 100;
        int driveYears = 3;

        //&& - short form
        //&  - full form
        if (age < 45 & driveYears++ > 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Not Ok");
        }

        // || -short form
        // | -full form

        System.out.println(driveYears);
    }
}
