package com.javarush.module1.lesson4;

public class Example4 {
    public static void main(String[] args) {
        // Person
        int age = 25;
        boolean isDriver = true;
        boolean isDrunk = false;

        boolean result = ((age >= 21) && isDriver) && (!isDrunk);

        System.out.println(result);
    }
}
