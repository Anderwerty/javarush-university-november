package com.javarush.module1.lesson2;

public class Example10 {
    public static void main(String[] args) {
        String name = "Alex";
        String surname = "Shevchenko";
        int age = 25;
        System.out.print(age);
        System.out.print(name);
        System.out.print(" ");
        System.out.println();

        String fullName = age + name + " " + surname + ", age: " + age;
        System.out.println(fullName);

        int result = Integer.parseInt("123");
        System.out.println(result);
    }
}
