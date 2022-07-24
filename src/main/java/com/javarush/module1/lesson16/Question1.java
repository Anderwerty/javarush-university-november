package com.javarush.module1.lesson16;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // read full line util \n
        int age = scanner.nextInt(); // read just number
        String surname = scanner.nextLine(); // read just \n
        String lastLine = scanner.nextLine(); // is it magic line??

        System.out.println("name: " + name +", number of symbols+ "+name.length());
        System.out.println("age: " + age);
        System.out.println("surname: " + surname +", number of symbols+ "+surname.length());
        System.out.println("lastline: " + lastLine +", number of symbols+ "+lastLine.length());
    }
}
