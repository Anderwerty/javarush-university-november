package com.javarush.module1.lesson12;

public class Example6 {
    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.name);
        System.out.println(user.age);

        user.name = "Alex";
        user.age = 15;

        System.out.println(user.name);
        System.out.println(user.age);

        user.printInfo();

        User user1 = new User();

    }
}

class User {

//    User user = new User(); //?

    public String name;
    public String surname;
    public int age;

    public User() {
        System.out.println("Create user");
    }

    public void printInfo() {
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Age " + age);
    }

}

