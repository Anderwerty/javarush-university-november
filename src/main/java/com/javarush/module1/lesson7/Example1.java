package com.javarush.module1.lesson7;

public class Example1 {
    public static void main(String[] args) {
//        int age = 21;
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        int size = 20;
        int[] ageOfUsers = new int[size];
        System.out.println(ageOfUsers[0]);//byte, short, int, long default 0,
        // default double, float 0.0
        // boolean  false
        // char empty symbol

        size++;
        ageOfUsers[0] = 10;
        ageOfUsers[1] = 1;

        System.out.println(ageOfUsers[0]);

        System.out.print("array length: ");
        System.out.println(ageOfUsers.length);
// 0 1 2 3 4 5 6 7 8 9
        for (int i = 0; i <= ageOfUsers.length - 1; i++) {
            ageOfUsers[i] = i * i;
        }

        for (int i = 0; i < ageOfUsers.length; i++) {
            System.out.println(ageOfUsers[i]);
        }
// age = ageOfUsers[0]
        for (int age : ageOfUsers) {
            System.out.println(age);
        }
    }
}
